package coordinate.model;

import java.util.List;

import static coordinate.constants.LineInfo.LINE_POINT_SIZE;
import static coordinate.constants.RectangleInfo.RECTANGLE_POINT_SIZE;
import static coordinate.constants.TriangleInfo.TRIANGLE_POINT_SIZE;


public class FigureFactory {

    public static Figure getInstance(List<Point> points) {
        if (points.size() == LINE_POINT_SIZE) {
            return new Line(points);
        }
        if (points.size() == RECTANGLE_POINT_SIZE) {
            return new Rectangle(points);
        }
        if (points.size() == TRIANGLE_POINT_SIZE) {
            return new Triangle(points);
        }

        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }
}
