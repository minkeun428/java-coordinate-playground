package coordinate.model;

import coordinate.exception.RangeException;

public class Point {
    private int x;
    private int y;
    private final static int LIMIT_SIZE = 24;

    public Point(int x, int y) {
        validate(x, y);
        this.x = x;
        this.y = y;
    }

    private void validate(int x, int y) {
        if (x > LIMIT_SIZE || y > LIMIT_SIZE) {
            throw new RangeException("입력 값은 24를 초과할 수 없습니다.");
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

}
