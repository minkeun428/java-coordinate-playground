package coordinate.model;

import java.util.List;

public class FigureFactory {

    public static Figure getInstance(List<Point> points) {
        if (points.size() == Line.LINE_POINT_SIZE) {
            return new Line(points);
        }

        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }
}
