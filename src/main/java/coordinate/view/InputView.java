package coordinate.view;

import coordinate.model.Figure;
import coordinate.model.FigureFactory;
import coordinate.model.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String INPUT_COORDINATE = "좌표를 입력하세요.";
    private static final String POINT_DELIMITER = "-";
    private static final String DELIMITER = ",";
    private static Scanner scanner = new Scanner(System.in);

    public static Figure inputCoordinate() {
        System.out.println(INPUT_COORDINATE);
        return inputCoordinate(scanner.nextLine());
    }

    public static Figure inputCoordinate(String input) {
        input = input.replace("(", "").replace(")", "");

        List<Point> points = createPoints(input);
        return FigureFactory.getInstance(points);
    }

    private static List<Point> createPoints(String input) {
        String[] stringPoints = input.split(POINT_DELIMITER);

        List<Point> points = new ArrayList();
        for (String inputPoints : stringPoints) {
            System.out.println("inputPoints::" + inputPoints);
            points.add(createPoint(inputPoints));
        }
        return points;
    }

    private static Point createPoint(String inputPoints) {
        String[] coordinates = inputPoints.split(DELIMITER);
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        return new Point(x, y);
    }

}
