package PKA.VL_03.PR_03;

import java.time.LocalDateTime;
import java.util.Arrays;

public class TestClassTime {
    public static void main(String[] args) {
        // Erstellen der Termin-Objekte
        Termin termin1 = new Termin("Mittagessen", "Kantine", LocalDateTime.now());
        Termin termin2 = new Termin("Fussball", "Feld A", LocalDateTime.of(2024, 2, 2, 15, 30));
        Termin termin3 = new Termin("Boba", "Moontea", LocalDateTime.of(2024, 12, 24, 10, 10));

        // Termin-Array erstellen und initialisieren
        Termin[] arrayTermine = {termin1, termin2, termin3};

        // Sortieren der Termine nach Zeitpunkt mit Lambda-Ausdruck
        //Arrays.sort(arrayTermine, Comparator.comparing(Termin::getZeitpunkt));
        Arrays.sort(arrayTermine, (t1, t2) -> t1.getZeitpunkt().compareTo(t2.getZeitpunkt()));

        // Ausgabe der sortierten Termine
        for (Termin termin : arrayTermine) {
            System.out.println(termin);
        }
    }
}

