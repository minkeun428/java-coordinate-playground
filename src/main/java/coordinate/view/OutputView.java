package coordinate.view;


import coordinate.model.Figure;

import static coordinate.constants.LineInfo.LINE_POINT_SIZE;
import static coordinate.constants.OutputInfo.*;
import static coordinate.constants.PointInfo.MAX_LIMIT;
import static coordinate.constants.PointInfo.MIN_LIMIT;
import static coordinate.constants.RectangleInfo.RECTANGLE_POINT_SIZE;
import static coordinate.constants.TriangleInfo.TRIANGLE_POINT_SIZE;


public class OutputView {

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
        for (int y = MAX_LIMIT; y >= MIN_LIMIT; y--) {
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
            System.out.printf("%4d", index);
            return;
        }
        System.out.print(FOUR_BLANK);
    }

    //점 찍기
    private static void showPoints(Figure figure, int y) {
        //x:1~24
        for (int x = MIN_LIMIT; x <= MAX_LIMIT; x++) {
            //figure의 points와 x,y가 같다면
            if (figure.hasPoint(x, y)) {
                //전체 길이가 4가 될 때까지 문자열을 공백으로 왼쪽 정렬하여 인쇄
                System.out.printf("%4s", MARK_OF_POINT);
                continue;
            }
            System.out.print(FOUR_BLANK);
        }
    }

    //x선 그리기
    private static void showHorizontalAxis() {
        System.out.print(FOUR_BLANK + ORIGIN);
        for (int x = MIN_LIMIT; x <= MAX_LIMIT; x++) {
            System.out.print(HORIZONTAL_AXIS);
        }
        System.out.println();
    }

    //x숫자 넣기
    private static void showHorizontalNumbers() {
        for (int x = 0; x <= MAX_LIMIT; x++) {
            showAxisNumber(x);
        }
        System.out.println();
    }

    public static void showAreaInfo(Figure figure) {
        if (figure.getPointSize() == LINE_POINT_SIZE) {
            System.out.print(OUTPUT_AREA_OF_LINE);
        }
        if (figure.getPointSize() == RECTANGLE_POINT_SIZE) {
            System.out.print(OUTPUT_AREA_OF_RECTANGLE);
        }
        if (figure.getPointSize() == TRIANGLE_POINT_SIZE) {
            System.out.print(OUTPUT_AREA_OF_TRIANGLE);
        }

        System.out.println(figure.getAreaInfo());
    }
}
