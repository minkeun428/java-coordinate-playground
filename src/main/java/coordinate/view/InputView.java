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
        //before -> "(10,12)-(14,16)"
        input = input.replace("(", "").replace(")", "");
        //after -> "10,12-14,16"

        List<Point> points = createPoints(input);
        return FigureFactory.getInstance(points);
    }

    private static List<Point> createPoints(String input) {
        String[] stringPoints = input.split(POINT_DELIMITER);
        //after -> index0 : 10,12 / index1 : 14,16

        List<Point> points = new ArrayList();
        for (String inputPoints : stringPoints) {
            points.add(createPoint(inputPoints));
        }
        //points.add(new Point(10,12));
        //points.add(new Point(14,16));
        return points;
    }

    private static Point createPoint(String inputPoints) {
        String[] coordinates = inputPoints.split(DELIMITER);
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        return new Point(x, y);
    }

}
