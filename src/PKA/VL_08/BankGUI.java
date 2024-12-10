package PKA.VL_08;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

public class BankGUI extends Application {
    public void start(Stage stage) {
        final Text msg = new Text();

        stage.setTitle("Willkommen");
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25));

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);

        Text t_welcome = new Text("Willkommen bei Ihrer Bank");

        Label l_user = new Label("Nutzername: ");
        Label l_pswd = new Label("Passwort: ");

        TextField tf_user = new TextField();
        PasswordField tf_pswd = new PasswordField();
        TextArea textArea = new TextArea();

        textArea.setPrefSize(400, 300);

        gridPane.add(t_welcome, 0, 0, 2, 1);
        gridPane.add(l_user, 0, 1);
        gridPane.add(tf_user, 1, 1);
        gridPane.add(l_pswd, 0, 2);
        gridPane.add(tf_pswd, 1, 2);
        gridPane.add(msg, 1, 4);

        Button login_button = new Button("Einloggen");


        login_button.setOnAction(actionEvent -> {
            if (tf_user.getText().equals("")) {
                msg.setText("Es wurde kein Nutzername eingegeben!");
            } else if (tf_pswd.getText().equals("")) {
                msg.setText("Es wurde kein Passwort eingegeben!");
            } else {
                msg.setText("Nutzer eingeloggt");
            }
        });

        gridPane.add(login_button, 1, 3);
        gridPane.add(textArea, 10, 4, 2, 1);
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
