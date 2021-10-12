package coordinate.model;

import coordinate.exception.RangeException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class PointSettingTest {

    @ParameterizedTest
    @CsvSource(value = {"(10,20):10:20"}, delimiter = ':')
    @DisplayName("괄호 잘 잘라지는지 확인하기")
    void checkSplitString(String inputString, int expectedX, int expectedY) {

        String newInput = inputString.replace("(", "").replace(")", "");
        String[] number = newInput.split(",");
        int actualx = Integer.parseInt(number[0]);
        int actualy = Integer.parseInt(number[1]);

        assertThat(actualx).isEqualTo(expectedX);
        assertThat(actualy).isEqualTo(expectedY);
    }

    @ParameterizedTest
    @CsvSource(value = {"(10,20):10:20"}, delimiter = ':')
    @DisplayName("PointSetting 생성 확인하기")
    void makePointSetting(String inputString, int expectedX, int expectedY) {

        PointSetting pointSetting = new PointSetting(inputString);
        int actualX = pointSetting.getX();
        int actualY = pointSetting.getY();

        assertThat(actualX).isEqualTo(expectedX);
        assertThat(actualY).isEqualTo(expectedY);
    }

    @ParameterizedTest
    @CsvSource(value = {"(10,25)"}, delimiter = ':')
    @DisplayName("좌표 생성 실패하기")
    void failCoordinate(String inputString) {

        assertThatThrownBy(() -> new PointSetting(inputString))
                .isInstanceOf(RangeException.class)
                .hasMessageContaining("정해진 좌표 값 내에서 입력해주세요.");
    }

}
