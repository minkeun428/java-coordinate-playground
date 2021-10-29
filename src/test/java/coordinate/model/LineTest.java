package coordinate.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @ParameterizedTest
    @CsvSource(value = {"5:10:5:20:10"}, delimiter = ':')
    @DisplayName("Line 길이 구하기")
    void getLineLength(int point1, int point2, int point3, int point4, int expectedLength) {
        List<Point> linePoints = Arrays.asList(
                new Point(point1, point2),
                new Point(point3, point4)
        );

        assertThat(new Line(linePoints).area()).isEqualTo(expectedLength);
    }
}
