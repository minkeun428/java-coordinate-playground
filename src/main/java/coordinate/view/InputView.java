package coordinate.view;


import java.util.Scanner;

import static coordinate.constants.InputInfo.INPUT_COORDINATE;
import static coordinate.constants.InputInfo.scanner;


public class InputView {

    public static String inputCoordinate() {
        System.out.println(INPUT_COORDINATE);

        return scanner.nextLine();
    }

}
