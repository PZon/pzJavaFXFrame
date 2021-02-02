package podsumowanieLesson9.Ctrl;

import podsumowanieLesson9.View.ViewFactory;

/**
 * Created by PZON_SM on 01.02.2021.
 **/
public abstract class BaseCtrl {
    private String fxmlFile;
    protected ViewFactory viewFactory;

    public BaseCtrl(ViewFactory viewFactory, String fxmlFile) {
        this.fxmlFile = fxmlFile;
        this.viewFactory = viewFactory;
    }

    public String getFxmlFile(){
        return fxmlFile;
    };
}
