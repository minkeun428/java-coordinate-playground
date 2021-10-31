package coordinate.model;

import java.util.List;

public class Line extends AbstractFigure{
    private static final String OUTPUT_AREA_OF_LINE = "두 점 사이의 거리는 ";
    public static final int LINE_POINT_SIZE = 2;


    public Line(List<Point> points) {

        super(points);
    }

    @Override
    public String getAreaInfo() {

        return OUTPUT_AREA_OF_LINE + area();
    }

    @Override
    public double area() {

        return getPoints().get(0).calculateDistance(getPoints().get(1));
    }

    @Override
    public int getPointSize() {

        return LINE_POINT_SIZE;
    }

}
