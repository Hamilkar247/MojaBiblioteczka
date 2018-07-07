package pl.moja.biblioteczka.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

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

}
