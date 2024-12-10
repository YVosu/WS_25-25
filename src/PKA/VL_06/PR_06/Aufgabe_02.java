package PKA.VL_06.PR_06;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aufgabe_02 {
    public static void main(String[] args) {

        String homeDirectory = System.getProperty("user.home");
        Path homePath = Paths.get(homeDirectory);
        long totalSize = 0;

        try {

            totalSize = Files.walk(homePath)
                    .filter(path -> path.toString().endsWith(".java"))
                    .mapToLong(path -> {
                        try {
                            return Files.size(path);
                        } catch (IOException e) {
                            System.err.println("Fehler beim Lesen der Datei: " + path);
                            return 0;
                        }
                    })
                    .sum();

            System.out.println("Gesamter Speicherbedarf aller *.java-Dateien: " + totalSize + " Bytes");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
