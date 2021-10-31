package coordinate.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PointFactory {
    private static final String POINT_DELIMITER = "-";
    private static final String DELIMITER = ",";

    public static Figure createInstance(String input) {
        List<Point> points = createPoints(removeBracket(input));

        return FigureFactory.getInstance(points);
    }

    public static String removeBracket(String input) {

        return input.replaceAll("\\(|\\)", "");
    }

    public static List<Point> createPoints(String input) {
        String[] stringPoints = input.split(POINT_DELIMITER);

        List<Point> points = Arrays.stream(stringPoints)
                .map(PointFactory::createPoint)
                .collect(Collectors.toList());

        return points;
    }

    private static Point createPoint(String inputPoints) {
        String[] coordinates = inputPoints.split(DELIMITER);
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        return new Point(x, y);
    }
}
