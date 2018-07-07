package pl.moja.biblioteczka.controllers;

import javafx.event.ActionEvent;

public class TopMenuButtonsController {

    private MainController mainController;


    public void openLibrary() {
        System.out.println("openLibrary");
    }

    public void openListBook() {
        System.out.println("openListBook");
    }

    public void openStatistics() {
        System.out.println("openStatistic");
    }


    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
