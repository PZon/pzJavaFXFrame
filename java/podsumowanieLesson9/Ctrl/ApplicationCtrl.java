package podsumowanieLesson9.Ctrl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import podsumowanieLesson9.View.ViewFactory;

import java.io.IOException;

/**
 * Created by PZON_SM on 29.01.2021.
 **/
public class ApplicationCtrl extends BaseCtrl {
    @FXML
    private Button applicationButton;

    public ApplicationCtrl(ViewFactory viewFactory, String fxmlFile) {
        super(viewFactory,fxmlFile);
    }

    @FXML
    void appButtonAction(ActionEvent event) {
        viewFactory.showStartWindow();
        Stage stage = (Stage) applicationButton.getScene().getWindow();
        viewFactory.closeStage(stage);
    }

    }