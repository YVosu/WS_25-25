package PKA.VL_08;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloJavaFX extends Application {
    private int clickCount = 0;

    @Override
    public void start(Stage stage) {
        Button button = new Button("Klick mich!");
        Button button2 = new Button("Klick mich um Programm zu schliessen!");
        Label label = new Label("Klick auf den Button!");
        HBox root = new HBox();
        Scene scene = new Scene(root, 500, 400);

        button.setOnAction(actionEvent -> {
            clickCount++;
            label.setText("Button wurde " + clickCount + " mal geklickt!");
        });

        button2.setOnAction(actionEvent -> {
            Platform.exit();
        });

        root.getChildren().addAll(button, button2, label);

        stage.setTitle("Meine JavaFX-Anwendung");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
