package PKA.VL_08.PR_08;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Steuerelemente extends Application {

    StringBuilder currentStyle = new StringBuilder();

    private void updateStyle(TextArea textArea, String stylePart) {
        String style = currentStyle.toString();
        if (style.contains(stylePart)) {
            style = style.replace(stylePart, "");
        } else {
            style += stylePart;
        }
        currentStyle = new StringBuilder(style.trim());
        textArea.setStyle(currentStyle.toString());
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Steuerelemente");

        GridPane gP = new GridPane();
        gP.setHgap(0);
        gP.setVgap(0);
        gP.setPadding(new Insets(5));


        //Notizblock Setzung
        TextArea textArea = new TextArea();
        textArea.setPrefSize(400, 100);

        // Buttons und Labels
        Button redButton = new Button("Rot");
        redButton.setStyle("-fx-background-radius: 15; -fx-min-width: 30px; -fx-min-height: 30px;");
        redButton.setOnAction(e -> updateStyle(textArea, "-fx-text-fill: red;"));

        Button greenButton = new Button("Grün");
        greenButton.setStyle("-fx-background-radius: 15; -fx-min-width: 30px; -fx-min-height: 30px;");
        greenButton.setOnAction(e -> updateStyle(textArea, "-fx-text-fill: green;"));

        Button blueButton = new Button("Blau");
        blueButton.setStyle("-fx-background-radius: 15; -fx-min-width: 30px; -fx-min-height: 30px;");
        blueButton.setOnAction(e -> updateStyle(textArea, "-fx-text-fill: blue;"));

        Button blackButton = new Button("Schwarz");
        blackButton.setStyle("-fx-background-radius: 15; -fx-min-width: 30px; -fx-min-height: 30px;");
        blackButton.setOnAction(e -> updateStyle(textArea, "-fx-text-fill: black;"));

        Button fontFatButton = new Button("Fett");
        fontFatButton.setStyle("-fx-background-radius: 0; -fx-min-width: 30px; -fx-min-height: 30px;");
        fontFatButton.setOnAction(e -> updateStyle(textArea, "-fx-font-weight: bold;"));

        CheckBox fontCursiveButton = new CheckBox();
        fontCursiveButton.setStyle("-fx-background-radius: 0; -fx-min-width: 30px; -fx-min-height: 30px;");
        fontCursiveButton.setOnAction(e -> updateStyle(textArea, "-fx-font-style: italic;"));


        HBox colorBox = new HBox(10, redButton, greenButton, blueButton, blackButton);
        HBox fontBox = new HBox(10, fontFatButton, fontCursiveButton);

        VBox root = new VBox();
        root.setPadding(new Insets(10));

        // Layout der Szene
        root.getChildren().addAll(textArea, colorBox, fontBox);

        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
