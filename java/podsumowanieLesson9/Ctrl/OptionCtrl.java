package podsumowanieLesson9.Ctrl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import podsumowanieLesson9.View.ViewFactory;

/**
 * Created by PZON_SM on 02.02.2021.
 **/
public class OptionCtrl extends BaseCtrl{
    @FXML
    private Button buttonOne;

    public OptionCtrl(ViewFactory viewFactory, String fxmlFile) {
        super(viewFactory, fxmlFile);
    }

    @FXML
    void returnButtonAction(ActionEvent event) {
        viewFactory.showStartWindow();
        Stage stage = (Stage) buttonOne.getScene().getWindow();
        viewFactory.closeStage(stage);
    }
}
