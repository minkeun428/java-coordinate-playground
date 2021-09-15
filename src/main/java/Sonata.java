public class Sonata extends Car {

    private String name = "Sonata";
    private int distance;
    private final int mileage = 10;

    public Sonata(int distance) {
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
