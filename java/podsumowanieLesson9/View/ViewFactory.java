package podsumowanieLesson9.View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import podsumowanieLesson9.Ctrl.BaseCtrl;
import podsumowanieLesson9.Ctrl.OptionCtrl;
import podsumowanieLesson9.Ctrl.MainWindowCtrl;
import podsumowanieLesson9.Ctrl.ApplicationCtrl;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by PZON_SM on 01.02.2021.
 **/
public class ViewFactory {
    private ArrayList<Stage> activeStages;
    public ViewFactory() {
        activeStages = new ArrayList<Stage>();
    }

    public void showStartWindow(){
        BaseCtrl baseCtrl = new MainWindowCtrl(this,"/fxml/podsumowanieL9/mainWindowTmpl.fxml");
        initializeStage(baseCtrl);
    }

    public void showAppWindow(){
        BaseCtrl baseCtrl = new ApplicationCtrl(this,"/fxml/podsumowanieL9/tmplApplication.fxml");
        initializeStage(baseCtrl);
    }

    public void showOptionWindow(){
        BaseCtrl baseCtrl = new OptionCtrl(this,"/fxml/podsumowanieL9/tmplOption.fxml");
        initializeStage(baseCtrl);
    }

    private void initializeStage(BaseCtrl baseCtrl){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(baseCtrl.getFxmlFile()));
        fxmlLoader.setController(baseCtrl);
        Parent parent;
        try{
            parent = fxmlLoader.load();
        }catch (IOException e ){
            e.printStackTrace();
            return;
        }

        Scene scene= new Scene(parent);
        Stage stage = new Stage();
        //tutaj dodatkowe opcje jak ikony czy tytuł;
        stage.setScene(scene);
        stage.show();
        activeStages.add(stage);
    }

    public void closeStage(Stage stage){
        stage.close();
        activeStages.remove(stage);
    }
}
