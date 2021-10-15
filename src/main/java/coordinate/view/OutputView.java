package coordinate.view;


import coordinate.model.Figure;
import coordinate.model.Point;

public class OutputView {
    private static final String FOUR_BLANK = "    ";
    private static final String VERTICAL_AXIS = "|";
    private static final String ORIGIN = "+";
    private static final String HORIZONTAL_AXIS = "----";
    private static final String MARK_OF_POINT = ".";

    public static void showCoordinate(Figure figure) {
        showVertical(figure);
        showHorizontalAxis();
        showHorizontalNumbers();
    }

    private static void showVertical(Figure figure) {
        //y좌표 24부터 시작
        for (int y = Point.MAX_LIMIT; y >= Point.MIN_LIMIT; y--) {
            showAxisNumber(y);  //y좌표 숫자 넣기
            System.out.println(VERTICAL_AXIS);  //y좌표 선 그리기
            showPoints(figure, y);  //점 찍기
            System.out.println();
        }
    }

    //x or y 숫자 넣기
    private static void showAxisNumber(int index) {
        if (index % 2 == 0) {
            System.out.print(String.format("%4d", index));
            return;
        }
        System.out.print(FOUR_BLANK);
    }

    //점 찍기
    private static void showPoints(Figure figure, int y) {
        //x좌표 1부터 시작
        for (int x = Point.MIN_LIMIT; x <= Point.MAX_LIMIT; x++) {
            if (figure.hasPoint(x, y)) {    //그리는 x or y가 같다면
                System.out.print(String.format("%4s", MARK_OF_POINT));
                continue;
            }
            System.out.print(FOUR_BLANK);
        }
    }

    //x선 그리기
    private static void showHorizontalAxis() {
        System.out.print(FOUR_BLANK + ORIGIN);
        for (int x = Point.MIN_LIMIT; x <= Point.MAX_LIMIT; x++) {
            System.out.print(HORIZONTAL_AXIS);
        }
        System.out.println();
    }

    //x숫자 넣기
    private static void showHorizontalNumbers() {
        for (int x = 0; x <= Point.MAX_LIMIT; x++) {
            showAxisNumber(x);
        }
        System.out.println();
    }


    public static void showArea(Figure figure) {
        System.out.println(figure.getAreaInfo());
    }
}
