package coordinate.model;

import coordinate.exception.RangeException;

public class PointSetting {

    private int x;
    private int y;
    private final static int MAX_SIZE = 24;
    private final static int MIN_SIZE = 0;

    public PointSetting(String input) {
        makeNumbers(input);
    }

    private void makeNumbers(String input) {
        String newInput = input.replace("(", "").replace(")", "");
        String[] number = newInput.split(",");

        int paramX = Integer.parseInt(number[0]);
        int paramY = Integer.parseInt(number[1]);
        validate(paramX, paramY);

        this.x = paramX;
        this.y = paramY;
    }

    private void validate(int x, int y) {
        if (x > MAX_SIZE || x < MIN_SIZE) {
            throw new RangeException("정해진 좌표 값 내에서 입력해주세요.");
        }
        if (y > MAX_SIZE || y < MIN_SIZE) {
            throw new RangeException("정해진 좌표 값 내에서 입력해주세요.");
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
