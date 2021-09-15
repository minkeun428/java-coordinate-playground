public class K5 extends Car {

    private String name = "K5";
    private int distance;
    private final int mileage = 13;

    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return this.mileage;
    }

    @Override
    double getTripDistance() {
        return this.distance;
    }

    String getName() {
        return this.name;
    }
}
