package coordinate.model;


public class Point {
    private final int x;
    private final int y;
    private final int POW_VAL = 2;
    private final String WRONG_RANGE_INPUT_VALUE = "잘못된 범위의 입력 값입니다.";
    public static final int MIN_LIMIT = 1;
    public static final int MAX_LIMIT = 24;

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

    public boolean isSame(int x, int y) {

        return this.x == x && this.y == y;
    }

    public double calculateDistance(Point point) {

        return Math.sqrt(calculatorPow(this.x, point.x) + calculatorPow(this.y, point.y));
    }

    private double calculatorPow(int firstValue, int secondValue) {

        return Math.pow(firstValue - secondValue, POW_VAL);
    }
}
