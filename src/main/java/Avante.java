public class Avante extends Car {

    private String name = "Avante";
    private int distance;
    private final int mileage = 15;

    public Avante(int distance) {
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
