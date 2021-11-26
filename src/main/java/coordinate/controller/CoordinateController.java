package coordinate.controller;

import coordinate.model.Figure;
import coordinate.model.PointFactory;
import coordinate.view.InputView;
import coordinate.view.OutputView;


public class CoordinateController {

    private final OutputView outputView;
    private final InputView inputView;

    public CoordinateController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }

    public void startCoordinate() {
        //좌표 입력
        String input = inputView.inputCoordinate();

        //Figure Instance 생성
        Figure figure = PointFactory.createInstance(input);

        //좌표 그리기
        outputView.showCoordinate(figure);

        //길이 or 면적계산
        outputView.showAreaInfo(figure);

    }

}
