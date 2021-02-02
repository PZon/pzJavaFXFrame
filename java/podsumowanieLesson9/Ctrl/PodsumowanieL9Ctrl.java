package podsumowanieLesson9.Ctrl;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import podsumowanieLesson9.View.ViewFactory;


/**
 * Created by PZON_SM on 29.01.2021.
 **/
public class PodsumowanieL9Ctrl extends BaseCtrl {

    @FXML
    private AnchorPane mainWindow;

    @FXML
    private Button inButton;

    @FXML
    private Button optionButton;

    @FXML
    private Button outButton;

    @FXML
    private Label error;

    public PodsumowanieL9Ctrl(ViewFactory viewFactory, String fxmlFile) {
        super(viewFactory, fxmlFile);
    }


    @FXML
    void buttonAction(ActionEvent e) {
        if (e.getSource() == inButton) {
            error.setText("in");
            viewFactory.showAppWindow();
            hideMainWindow(mainWindow);
        } else if (e.getSource() == outButton) {
            error.setText("out");
            //hideMainWindow(mainWindow);
            Platform.exit();
        } else if (e.getSource() == optionButton) {
            viewFactory.showOptionWindow();
            hideMainWindow(mainWindow);
        }
    }


    private void hideMainWindow(AnchorPane anchorPane) {
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        viewFactory.closeStage(stage);
    }
}