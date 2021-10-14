package coordinate.view;

import coordinate.model.PointSetting;

import java.io.PrintStream;
import java.util.List;

public class OutputView {
    private final PrintStream out = new PrintStream(System.out);
    private static final int COORDINATE_SIZE = 24;
    private static final String ORIGIN = "┼";
    private static final String X_AXIS = "─";
    private static final String Y_AXIS = "│";
    private static final String LINE_BREAK = "\n";
    private static final String BLANK = " ";
    private static final String POINT = "●";

    public void showCoordinate(List<PointSetting> points) {
        StringBuilder output = new StringBuilder();
        for (int i = COORDINATE_SIZE; i >= 0; i--) {
            output.append(drawYAxis(i));
            output.append(LINE_BREAK);
        }
        out.println(output);
    }

    public void putPoints(List<PointSetting> pointSettingList) {

    }

    private String drawYAxis(int number) {
        StringBuilder output = new StringBuilder();

        if (number < 10) {
            output.append(BLANK);
        }
        if(number == 0) {
            output.append(number);
            output.append(ORIGIN);
            output.append(drawXAxis());
        } else {
            output.append(number);
            output.append(Y_AXIS);
        }

        return output.toString();
    }

    private StringBuilder drawXAxis() {
        StringBuilder output = new StringBuilder();
        for (int j = 0; j <= COORDINATE_SIZE; j++) {
            output.append(X_AXIS);
        }
        return output;
    }
}
