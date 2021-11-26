package coordinate.model;

import java.util.List;

import static coordinate.constants.LineInfo.LINE_POINT_SIZE;

public enum FigureFactoryEnum {

    //변경이 잘 일어나지 않는 선, 삼각형, 사각형의 구조 같은 경우에는
    //enum으로 정의하여 좀 더 명확한 틀을 제공한다.

//    LINE("선", new Line(points)),
    RECTANGLE,
    TRIANGLE;

    private List<Point> points;

    static Figure FigureFactoryEnum(List<Point> points) {
        if(points.size() == LINE_POINT_SIZE) {
            return new Line(points);
        }
        throw new IllegalArgumentException();
    }

}
