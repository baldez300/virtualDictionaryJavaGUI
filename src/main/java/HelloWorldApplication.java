import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloWorldApplication extends Application {

    public void start(Stage stage) {
        VBox layout = new VBox();

        Button button = new Button("CLICK ME!");
        layout.getChildren().add(button);

        Scene view = new Scene(layout);

        view.getStylesheets().add(getClass().getClassLoader().getResource("style.css").toExternalForm());

        stage.setScene(view);
        stage.show();
    }
}