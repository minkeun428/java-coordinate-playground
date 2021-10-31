package coordinate.model;

import java.util.List;

public class Triangle extends AbstractFigure {
    private static final String OUTPUT_AREA_OF_LINE = "삼각형의 넓이는 ";
    public static final int TRIANGLE_POINT_SIZE = 3;

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public String getAreaInfo() {
        return OUTPUT_AREA_OF_LINE + area();
    }

    @Override
    public double area() {
//        System.out.println("1::" + getPoints().get(0).getX() + "//" + getPoints().get(0).getY());
//        System.out.println("2::" + getPoints().get(1).getX() + "//" + getPoints().get(1).getY());
//        System.out.println("3::" + getPoints().get(2).getX() + "//" + getPoints().get(2).getY());
//
//        return 0;

        return (getPoints().get(0).calculateDistance(getPoints().get(1))
                + getPoints().get(1).calculateDistance(getPoints().get(2))
                + getPoints().get(2).calculateDistance(getPoints().get(0)))
                / 2;
    }

    @Override
    public int getPointSize() {
        return TRIANGLE_POINT_SIZE;
    }

}
