package coordinate.controller;

import coordinate.model.Figure;
import coordinate.view.InputView;
import coordinate.view.OutputView;


public class CoordinateController {

    public void startCoordinate() {
        Figure figure = InputView.inputCoordinate();
        OutputView.showCoordinate(figure);
        OutputView.showArea(figure);

    }

}
