/**
 * Created by PZON_SM on 05.01.2021.
 **/
module JavaFXYTubePL {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires org.json;

    opens podsumowanieLesson9;
    opens podsumowanieLesson9.Ctrl;
    opens podsumowanieLesson9.View;
}