package coordinate.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class PointTest {

    @ParameterizedTest
    @CsvSource({"'(', 10, ',', 20, ')'"})
    @DisplayName("X좌표 생성하기")
    void makePoint(String left, Integer x, String delimeter, Integer y, String right) {
        System.out.println("left::" + left);
        System.out.println("deli::" + delimeter);

        Point point = new Point(x, y);
        int actualx = point.getX();
        int actualy = point.getY();
        assertThat(actualx).isEqualTo(x);
        assertThat(actualy).isEqualTo(y);
    }

}
