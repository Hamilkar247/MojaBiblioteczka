package pl.moja.biblioteczka.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

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

}
