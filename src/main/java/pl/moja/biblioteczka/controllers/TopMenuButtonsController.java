package pl.moja.biblioteczka.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

    public static final String LIBRARY_FXML = "/fxml/Library.fxml";
    public static final String LIST_BOOKS_FXML = "/fxml/ListBooks.fxml";
    public static final String STATISTICS_FXML = "/fxml/Statistics.fxml";
    public static final String ADD_BOOK_FXML = "/fxml/AddBook.fxml";
    @FXML
    private ToggleGroup toggleButtons;


    private MainController mainController;



    @FXML
    public void openLibrary() {
        mainController.setCenter(LIBRARY_FXML);
    }
    @FXML
    public void openListBook() {
        mainController.setCenter(LIST_BOOKS_FXML);
    }
    @FXML
    public void openStatistics() {
        mainController.setCenter(STATISTICS_FXML);
    }


    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }


    @FXML
    public void addBook(ActionEvent actionEvent) {
        if(toggleButtons.getSelectedToggle()!=null){
            toggleButtons.getSelectedToggle().setSelected(false);
        }
        mainController.setCenter(ADD_BOOK_FXML); //metoda wstawiajaca tego fxmla w srodokowa czesc
    }
}
