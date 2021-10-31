package coordinate.model;

import java.util.List;


public abstract class AbstractFigure implements Figure {
    private final List<Point> points;

    public AbstractFigure(List<Point> points) {

        this.points = points;
    }

    @Override
    public boolean hasPoint(int x, int y) {

        return getPoints().stream()
                .anyMatch(point -> point.isSame(x, y));
    }

    @Override
    public List<Point> getPoints() {

        return points;
    }
}
