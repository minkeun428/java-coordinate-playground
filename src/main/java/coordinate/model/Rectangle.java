package coordinate.model;

import java.util.List;

import static coordinate.constants.RectangleInfo.RECTANGLE_POINT_SIZE;


public class Rectangle extends AbstractFigure {

    public Rectangle(List<Point> points) {

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

        return distance1.getDistance() * distance2.getDistance();
    }

    @Override
    public int getPointSize() {

        return RECTANGLE_POINT_SIZE;
    }
}
