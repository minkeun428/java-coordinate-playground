package coordinate.controller;

import coordinate.model.PointSetting;
import coordinate.view.InputView;
import coordinate.view.OutputView;

import java.util.List;

public class CoordinateController {

    public static void startLineCoordinate() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        List<PointSetting> pointSettingList = inputView.start();

        outputView.showCoordinate();
    }

}
