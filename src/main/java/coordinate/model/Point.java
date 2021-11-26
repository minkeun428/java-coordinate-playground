package coordinate.model;


import static coordinate.constants.PointInfo.*;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        validation(x, y);
        this.x = x;
        this.y = y;
    }

    private void validation(int x, int y) {
        if (checkRange(x) || checkRange(y)) {
            throw new IllegalArgumentException(WRONG_RANGE_INPUT_VALUE);
        }
    }

    private boolean checkRange(int coordinate) {

        return coordinate < MIN_LIMIT || coordinate > MAX_LIMIT;
    }

    public int getX() {

        return this.x;
    }

    public int getY() {

        return this.y;
    }

//    @Override
//    public boolean equals(int paramX, int paramY) {
//        // equals메서드는 주소값이 다른 객체는 서로 다른 객체로 판단
//        // equals를 재정의하여 주소 값이 달라도 같은 객은 객체로 판단할 수 있다.
//
//        return this.x == paramX && this.y == paramY;
//    }

//    @Override
//    public int hashCode() {
//
//        return Objects.hash(x, y);
//    }

    public boolean isSame(int paramX, int paramY) {

        return this.x == paramX && this.y == paramY;
    }

    public double calculateDistance(Point point) {

        return Math.sqrt(calculatorPow(this.x, point.x) + calculatorPow(this.y, point.y));
    }

    private double calculatorPow(int firstValue, int secondValue) {

        return Math.pow(firstValue - secondValue, POW_VAL);
    }
}
