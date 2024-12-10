package PKA.VL_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

public class FilesAttributeExample {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\Anwender\\OneDrive\\Dokumente\\4-1");
        String home = System.getProperty("user.home");
        Path filePath2 = Paths.get(home, "Documents", "Textdatei");


        try {
            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Erstellungsdatum: " + attrs.creationTime());
            System.out.println("Letze Aenderung: " + attrs.lastModifiedTime());
            System.out.println("Groesse in Bytes: " + attrs.size());
            System.out.println(attrs.isRegularFile());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
        }

        System.out.println("----------------------------------------------");

        try {
            FileOwnerAttributeView ownerAttributeView = Files.getFileAttributeView(filePath, FileOwnerAttributeView.class);
            UserPrincipal owner = ownerAttributeView.getOwner();
            System.out.println("Dateieigentümer: " + owner.getName());

            BasicFileAttributes attributes = Files.readAttributes(filePath2, BasicFileAttributes.class);
            System.out.println(attributes.lastModifiedTime());
            System.out.println(attributes.lastAccessTime());
            System.out.println(attributes.isRegularFile());
            System.out.println(attributes.isDirectory());
            System.out.println(attributes.isSymbolicLink());
            System.out.println(attributes.isOther());
            System.out.println(attributes.size());
            System.out.println(attributes.fileKey());
            System.out.println(attributes.creationTime());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
