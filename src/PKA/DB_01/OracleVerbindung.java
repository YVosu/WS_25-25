package PKA.DB_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleVerbindung {
    
    private static Connection con;
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Korrigierte URL
    protected static Statement befehl;

    public static void connect() {
        try {
            con = DriverManager.getConnection(url, "testuser", "oracle"); // Korrekte Zugangsdaten
            befehl = con.createStatement();
            con.setAutoCommit(true);
            System.out.println("Verbindung erfolgreich hergestellt.");
        } catch (SQLException e) {
            e.printStackTrace(); // Gibt Fehlerdetails aus
            System.out.println("Verbindung fehlgeschlagen.");
        }
    }

    public static void main(String[] args) {
        connect(); // Verbindung testen
    }
}
