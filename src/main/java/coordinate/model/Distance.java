package coordinate.model;

import static coordinate.constants.PointInfo.POW_VAL;

public class Distance {
    private double distance;

    public Distance(Point point1, Point point2) {
        this.distance = Math.sqrt(calculatorPow(point1.getX(), point2.getX())
                + calculatorPow(point1.getY(), point2.getY()));
    }

    public double getDistance() {
        return this.distance;
    }

    private double calculatorPow(int firstValue, int secondValue) {

        return Math.pow(firstValue - secondValue, POW_VAL);
    }

}
