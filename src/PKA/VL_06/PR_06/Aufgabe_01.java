package PKA.VL_06.PR_06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Aufgabe_01 {
    public static void main(String[] args) {

        //String filePath = "C:\\Users\\Anwender\\Documents\\Textdatei\\Textdokument.txt";
        Path filePath = Path.of("C:\\Users\\Anwender\\Documents\\Textdatei\\Aufgabe_01.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile(), true))){
            FileOwnerAttributeView ownerAttributeView = Files.getFileAttributeView(filePath, FileOwnerAttributeView.class);
            UserPrincipal owner = ownerAttributeView.getOwner();

            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            writer.write("Dateieigentuemer: " + owner.getName() + '\n');
            writer.write(String.valueOf(LocalTime.now()) + '\n');
            writer.write(String.valueOf(LocalDate.now()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
