package coordinate.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RectangleTest {
    @ParameterizedTest
    @CsvSource(value = {"10:10:10:20:20:20:20:10:100"}, delimiter = ':')
    @DisplayName("직사각형 면적 구하기")
    void makeRectangleArea(int point1, int point2, int point3, int point4,
            int point5, int point6, int point7, int point8, int expected) {
        List<Point> rectanglePoints = Arrays.asList(
                new Point(point1, point2),
                new Point(point3, point4),
                new Point(point5, point6),
                new Point(point7, point8)
        );

        assertThat(Math.round(new Rectangle(rectanglePoints).area()))
                .isEqualTo(expected);
    }
}
