package coordinate.view;



import static coordinate.constants.InputInfo.INPUT_COORDINATE;
import static coordinate.constants.InputInfo.scanner;


public class InputView extends View {

    public String inputCoordinate() {
        out.println(INPUT_COORDINATE);

        return scanner.nextLine();
    }

}
