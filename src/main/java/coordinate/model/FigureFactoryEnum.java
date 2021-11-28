package coordinate.model;


import coordinate.exception.RangeException;

import java.util.Arrays;
import java.util.List;

public enum FigureFactoryEnum {
    LINE(2) {
        @Override
        Figure maker(List<Point> points) {
            return new Line(points);
        }
    },
    TRIANGLE(3) {
        @Override
        Figure maker(List<Point> points) {
            return new Triangle(points);
        }
    },
    RECTANGLE(4) {
        @Override
        Figure maker(List<Point> points) {
            return new Rectangle(points);
        }
    };

    private int pointSize;

    FigureFactoryEnum(int pointSize) {
        this.pointSize = pointSize;
    }

    // Enum의 필드에 추상메소드를 선언하고,
    // 이를 상수들이 구현하도록 하면 Function 인터페이스 사용과 동일.
    // FigureFactoryEnum 생성자가 만들어지는 위치는? values()가 호출될 때!
    static Figure FigureFactoryEnum (List<Point> points) {
        return Arrays.stream(FigureFactoryEnum.values())
                .filter(figureFactoryEnum -> figureFactoryEnum.pointSize == points.size())
                .findAny()
                .orElseThrow(() -> new RangeException("유효하지 않은 도형입니다."))
                .maker(points);
    }

    abstract Figure maker(List<Point> points);
}
