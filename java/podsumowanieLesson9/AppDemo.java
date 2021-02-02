package podsumowanieLesson9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import podsumowanieLesson9.View.ViewFactory;

/**
 * Created by PZON_SM on 29.01.2021.
 **/
public class AppDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ViewFactory viewFactory = new ViewFactory();
        viewFactory.showStartWindow();
    }
}
