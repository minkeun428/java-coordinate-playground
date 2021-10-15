package coordinate.model;

import java.util.List;


//abstract와 interface 차이 명확히 알고 있기!
//공통적인 기능에 해당하는 메소드를 추출해서 추상클래스 안에 넣어둔다.
//실체 클래스의 공통적인 부분을 추출해 어느정도 규격을 잡아놓은 추상적인 클래스
//추상클래스와 실체클래스는 상속관계!
//추상클래스를 상속 받은 실체 클래스들은 반드시 오버라이딩해서 실행 내용을 작성해야 한다.
//여기서 강제로 주어지는 필드와 메서드를 가지고 line, triangle, rectangle을 구현하면 된다.
//결국, 소스 수정시 다른 소스의 영향도를 적게 가져가면서 변화에는 유연하게 만들기 위해 추상 클래스를 사용하기도 함.
public abstract class AbstractFigure implements Figure {
    private final List<Point> points;

    public AbstractFigure(List<Point> points) {
        //TODO : validation 추가
        this.points = points;
    }

//    protected Point getPoint(int index) {
//        return points.get(index);
//    }

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
