package pl.moja.biblioteczka.controllers;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ResourceBundle;

public class MainController {

    @FXML
    //tutaj uwaga, zaincludowany w fxml borderPaneMain TopMenuButtons.fxml dostał id=topMenuButtons , ale zeby dzialalo musimy dopisac do nazwy Controller
    private TopMenuButtonsController topMenuButtonsController; //wstrzykniety kontroler dotyczacy TopMenuButtons

    @FXML
    private BorderPane borderPane;

    @FXML
    private void initialize(){
        topMenuButtonsController.setMainController(this);
    }


    public void setCenter(String fxmlPath){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(fxmlPath));
        //Obiekt umożlwiający internacjonalizacje języka
        ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");;
        loader.setResources(bundle);

        Parent parent = null;
        try {
            parent = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        borderPane.setCenter(parent);
    }

    public void closeApplication() {
        Platform.exit();
        System.exit(0);
    }

    public void setCaspian() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);
    }

    public void setModena() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_MODENA);
    }

    public void setAlwaysOnTop(ActionEvent actionEvent) {
        //dobieramy sie do stage
        Stage stage = (Stage) borderPane.getScene().getWindow();
        boolean value =((CheckMenuItem) actionEvent.getSource()).selectedProperty().get(); //sprawdzam czy zawsze na wierzchu jest wcisniete czy nie
        stage.setAlwaysOnTop(value);

    }

    public void about() {
    }
}
