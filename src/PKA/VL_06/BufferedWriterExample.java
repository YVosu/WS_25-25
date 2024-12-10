package PKA.VL_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Anwender\\Documents\\Textdatei\\Textdokument.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))){
            writer.write("Das ist eine Beispielzeile");
            writer.newLine();
            writer.write("Das ist eine zweite Zeile");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
        }
    }
}
