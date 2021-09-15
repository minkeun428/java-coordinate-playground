import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    List<Car> carList = new ArrayList<>();

    //객체 생성 팩토리 메서드
    static RentCompany create() {
        return new RentCompany();
    }

    void addCar(Car car) {
        this.carList.add(car);
    }

    public String generateReport() {
        StringBuilder result = new StringBuilder();
        getStringReport(result);

        return result.toString();
    }

    private void getStringReport(StringBuilder result) {
        for (Car car : this.carList) {
            result.append(car.getName()).append(" : ")
                .append((int) car.getChargeQuantity())
                .append("리터")
                .append(NEWLINE);
        }
    }
}
