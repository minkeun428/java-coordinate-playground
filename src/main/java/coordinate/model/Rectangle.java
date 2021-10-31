package coordinate.model;

import java.util.List;

public class Rectangle extends AbstractFigure {
    public static final int RECTANGLE_POINT_SIZE = 4;

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public Double getAreaInfo() {
        return area();
    }

    @Override
    public double area() {
        return getPoints().get(0).calculateDistance(getPoints().get(1))
                * getPoints().get(1).calculateDistance(getPoints().get(2));
    }

    @Override
    public int getPointSize() {
        return RECTANGLE_POINT_SIZE;
    }
}
