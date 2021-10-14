package coordinate.model;

import coordinate.exception.RangeException;

public class PointSetting {

    private final static int MAX_SIZE = 24;
    private final static int MIN_SIZE = 0;

    public PointSetting(String input) {

        makeNumbers(input);
    }

    public Point makeNumbers(String input) {
        String newInput = input.replace("(", "").replace(")", "");
        String[] number = newInput.split(",");

        int paramX = Integer.parseInt(number[0]);
        int paramY = Integer.parseInt(number[1]);
        validate(paramX, paramY);

        return new Point(paramX, paramY);
    }

    private void validate(int x, int y) {
        if (x > MAX_SIZE || x < MIN_SIZE) {
            throw new RangeException("정해진 좌표 값 내에서 입력해주세요.");
        }
        if (y > MAX_SIZE || y < MIN_SIZE) {
            throw new RangeException("정해진 좌표 값 내에서 입력해주세요.");
        }
    }

}
