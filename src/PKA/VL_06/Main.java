package PKA.VL_06;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {

        //ruft das Home-Verzeichnis des aktuellen Benutzers ab
        String home = System.getProperty("user.home");


        Path txt = Paths.get(home, "meintext.txt");
        Path foto = Paths.get(home, "Pictures", "foto.jpg");
        System.out.println(foto.toString());
        System.out.println(txt.toString());

        Path filePath = Paths.get(home, "Documents", "Textdatei");

        System.out.println(filePath.toString());
    }
}
