package coordinate.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PointFactoryTest {

    @ParameterizedTest
    @ValueSource(strings = {"(10,12)-(14,16)"})
    @DisplayName("괄호 제거 테스트")
    void removeBracketTest(String input) {
        String expected = "10,12-14,16";

        assertThat(PointFactory.removeBracket(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"(10,12)-(14,16):2"}, delimiter = ':')
    @DisplayName("inputCoordinate Line 테스트")
    void inputCoordinateLineTest(String input, int expected) {
        Figure actualFigure = PointFactory.createInstance(input);

        assertThat(actualFigure.getPointSize()).isEqualTo(expected);
    }

}
