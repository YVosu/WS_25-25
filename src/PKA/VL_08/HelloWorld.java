package PKA.VL_08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    @Override
    public void start(Stage stage) {
        Text text = new Text(10, 40, "Hello World");
        text.setFont(new Font(40));

        Button button = new Button();
        button.setMaxSize(5000, 30);

        Pane glasspanel = new Pane();
        glasspanel.getChildren().add(text);
        glasspanel.getChildren().add(button);

        Scene scene1 = new Scene(glasspanel, 100, 300);

        stage.setTitle("Welcome to JavaFX!");
        stage.setScene(scene1);
        stage.show();
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setFullScreenExitHint("Exit Hint");
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

