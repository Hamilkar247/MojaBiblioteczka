package pl.moja.biblioteczka.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

    @FXML
    private ToggleGroup toggleButtons;


    private MainController mainController;

    @FXML
    public void openLibrary() {
        System.out.println("openLibrary");
    }
    @FXML
    public void openListBook() {
        System.out.println("openListBook");
    }
    @FXML
    public void openStatistics() {
        System.out.println("openStatistic");
    }


    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }


    @FXML
    public void addBook(ActionEvent actionEvent) {
        if(toggleButtons.getSelectedToggle()!=null){
            toggleButtons.getSelectedToggle().setSelected(false);
        }
        mainController.setCenter("/fxml/AddBook.fxml");
    }
}
