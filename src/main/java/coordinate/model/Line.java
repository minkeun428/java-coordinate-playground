package coordinate.model;

import java.util.List;

import static coordinate.constants.LineInfo.LINE_POINT_SIZE;


public class Line extends AbstractFigure{

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public Double getAreaInfo() {

        return area();
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
