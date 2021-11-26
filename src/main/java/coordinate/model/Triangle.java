package coordinate.model;

import java.util.List;

import static coordinate.constants.TriangleInfo.TRIANGLE_POINT_SIZE;


public class Triangle extends AbstractFigure {

    public Triangle(List<Point> points) {

        super(points);
    }

    @Override
    public Double getAreaInfo() {
        return area();
    }

    @Override
    public double area() {
        Point point1 = getPoints().get(0);
        Point point2 = getPoints().get(1);
        Point point3 = getPoints().get(2);

        Distance distance1 = new Distance(point1, point2);
        Distance distance2 = new Distance(point2, point3);
        Distance distance3 = new Distance(point3, point1);

        return (distance1.getDistance()
                + distance2.getDistance()
                + distance3.getDistance()) / 2;
    }

    @Override
    public int getPointSize() {
        return TRIANGLE_POINT_SIZE;
    }
}
