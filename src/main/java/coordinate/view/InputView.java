package coordinate.view;

import coordinate.model.PointSetting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public List<PointSetting> start() {
        System.out.println("좌표를 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        return filtering(scanner.next());
    }

    private List<PointSetting> filtering(String input) {
        String[] splitInput = input.split("-");
        PointSetting pointSetting1 = new PointSetting(splitInput[0]);
        PointSetting pointSetting2 = new PointSetting(splitInput[1]);

        List<PointSetting> pointSettingList = new ArrayList<>();
        pointSettingList.add(pointSetting1);
        pointSettingList.add(pointSetting2);

        return pointSettingList;
    }
}
