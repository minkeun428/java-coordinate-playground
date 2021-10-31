package coordinate.controller;

import coordinate.model.Figure;
import coordinate.model.PointFactory;
import coordinate.view.InputView;
import coordinate.view.OutputView;


public class CoordinateController {

    public void startCoordinate() {
        //좌표 입력
        String input = InputView.inputCoordinate();

        //Figure Instance 생성
        Figure figure = PointFactory.createInstance(input);

        //좌표 그리기
        OutputView.showCoordinate(figure);

        //길이 or 면적계산
        OutputView.showAreaInfo(figure);

    }

}
