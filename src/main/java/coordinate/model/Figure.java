package coordinate.model;

import java.util.List;

public interface Figure {

    List<Point> getPoints();

    boolean hasPoint(int x, int y);

    String getAreaInfo();

    double area();

    int getPointSize();
}
