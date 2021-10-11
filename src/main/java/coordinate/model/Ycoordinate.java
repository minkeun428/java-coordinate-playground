package coordinate.model;

public class Ycoordinate {
    private int position;
    private final static int LIMIT_SIZE = 24;

    public Ycoordinate(int position) {
        validate(position);
        this.position = position;
    }

    private void validate(int position) {
        if (position > LIMIT_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    public int getPosition() {
        return this.position;
    }
}
