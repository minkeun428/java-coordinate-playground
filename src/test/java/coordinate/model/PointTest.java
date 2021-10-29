package coordinate.model;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class PointTest {

    @ParameterizedTest
    @CsvSource(value = {"10:20"}, delimiter = ':')
    @DisplayName("Point 생성하기")
    void makePoint(int x, int y){
        int actualX = new Point(x, y).getX();
        int actualY = new Point(x, y).getY();

        assertThat(actualX).isEqualTo(x);
        assertThat(actualY).isEqualTo(y);
    }

    @ParameterizedTest
    @CsvSource(value = {"10:29"}, delimiter = ':')
    @DisplayName("지정된 범위를 벗어난 Point")
    void not_point(int x, int y) {
        assertThatThrownBy(() -> new Point(x, y))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
