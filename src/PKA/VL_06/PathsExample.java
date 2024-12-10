package PKA.VL_06;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsExample {
    public static void main(String[] args) {
        Path pat = Paths.get("example.txt");
        System.out.println("Erstellter Pfad: " + pat.toString());
    }
}
