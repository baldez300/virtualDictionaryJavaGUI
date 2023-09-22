package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    private DictionaryController controller;

    private TextField wordInput;
    private Button searchButton;
    private Label meaningLabel;

    @Override
    public void start(Stage window) {
        controller = new DictionaryController(); // Use the controller

        // Initialize JavaFX components
        wordInput = new TextField();
        searchButton = new Button("Search");
        meaningLabel = new Label();

        // Define layout
        VBox root = new VBox(10);
        root.getChildren().addAll(wordInput, searchButton, meaningLabel);
        Scene view = new Scene(root, 300, 200);

        // Add event handler for the search button
        searchButton.setOnAction(event -> searchWord());

        // Set the stage
        window.setTitle("Virtual Dictionary");
        window.setScene(view);
        window.show();
    }

    // Method to search for a word in the dictionary and retrieve its meaning
    private void searchWord() {
        String word = wordInput.getText();
        String meaning = controller.searchWord(word); // Pass the word to the controller
        meaningLabel.setText(meaning);
    }

}


