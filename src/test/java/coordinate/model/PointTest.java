package coordinate.model;

import static org.assertj.core.api.Assertions.*;

import coordinate.exception.RangeException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class PointTest {

    @ParameterizedTest
    @CsvSource({""})
    @DisplayName("X좌표 생성하기")
    void makePoint(int expected, int expected2) {
        Point point = new Point(expected, expected2);
        int actualx = point.getX();
        int actualy = point.getY();
        assertThat(actualx).isEqualTo(expected);
        assertThat(actualy).isEqualTo(expected2);
    }

    @ParameterizedTest
    @ValueSource(ints = {25})
    @DisplayName("X좌표 생성 실패하기")
    void failXCoordinate(int expected) {
        assertThatThrownBy(() -> new Xcoordinate(expected))
                .isInstanceOf(RangeException.class)
                .hasMessageContaining("입력 값은 24를 초과할 수 없습니다.");
    }


}
