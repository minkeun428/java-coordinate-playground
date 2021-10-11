package coordinate.model;


import coordinate.exception.RangeException;

public class Xcoordinate {
    private int position;
    private final static int LIMIT_SIZE = 24;

    public Xcoordinate(int position) {
        validate(position);
        this.position = position;
    }

    private void validate(int position) {
        if (position > LIMIT_SIZE) {
            throw new RangeException("입력 값은 24를 초과할 수 없습니다.");
        }
    }

    public int getPosition() {
        return this.position;
    }
}
