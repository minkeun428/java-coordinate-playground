package coordinate.model;

import java.util.List;

public interface Figure {
    //추상 메소드 -> 가이드만 줄테니 추상 메소드를 오버라이딩해서 재구현해라
    List<Point> getPoints();

    boolean hasPoint(int x, int y);

    String getAreaInfo();

    double area();
}
