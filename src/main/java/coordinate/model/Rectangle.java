package coordinate.model;

import java.util.List;

public class Rectangle extends AbstractFigure {
    private static final String OUTPUT_AREA_OF_LINE = "사각형의 넓이는";
    public static final int RECTANGLE_POINT_SIZE = 4;

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public String getAreaInfo() {
        return OUTPUT_AREA_OF_LINE + area();
    }

    @Override
    public double area() {
        return getPoints().get(0).calculateDistance(getPoints().get(1))
                * getPoints().get(1).calculateDistance(getPoints().get(2));
    }
}
