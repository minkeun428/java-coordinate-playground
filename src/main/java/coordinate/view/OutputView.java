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
        //y좌표 그리기 및 점 찍기
        showVertical(figure);
        //x좌표 그리기
        showHorizontalAxis();
        //x좌표 숫자 넣기
        showHorizontalNumbers();
    }

    private static void showVertical(Figure figure) {
        //y좌표 24부터 시작
        for (int y = Point.MAX_LIMIT; y >= Point.MIN_LIMIT; y--) {
            showAxisNumber(y);  //y좌표 숫자 넣기 (24~1)
            System.out.println(VERTICAL_AXIS);  //y좌표 선 그리기
            showPoints(figure, y);  //객체 넘기면서 점 찍기
            System.out.println();
        }
    }

    //x or y 숫자 넣기
    private static void showAxisNumber(int index) {
        if (index % 2 == 0) {
            //네 칸, 기본적으로 오른쪽 맞춤
            System.out.print(String.format("%4d", index));
            return;
        }
        System.out.print(FOUR_BLANK);
    }

    //점 찍기
    private static void showPoints(Figure figure, int y) {
        //x:1~24
        for (int x = Point.MIN_LIMIT; x <= Point.MAX_LIMIT; x++) {
            //그리는 x or y가 같다면
            if (figure.hasPoint(x, y)) {
                //전체 길이가 4가 될 때까지 문자열을 공백으로 왼쪽 정렬하여 인쇄
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
