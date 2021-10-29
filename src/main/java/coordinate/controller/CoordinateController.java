package coordinate.controller;

import coordinate.model.Figure;
import coordinate.view.InputView;
import coordinate.view.OutputView;


public class CoordinateController {

    public void startCoordinate() {
        //좌표 입력 및 생성
        Figure figure = InputView.inputCoordinate();

        OutputView.showCoordinate(figure);

        OutputView.showArea(figure);

    }

}
