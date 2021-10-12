package coordinate.model.view;

import coordinate.view.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class InputViewTest {

    @Test
    @DisplayName("좌표 입력 받는 view")
    void createInputView() {

        InputView inputView = new InputView();
        inputView.start();

        //assertThat(inputView.getInputString()).isEqualTo("(10,10)");
        
    }
}

