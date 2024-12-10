package PKA.VL_07.GPT_Aufgabe_03b;

public class Main {
    public static void main(String[] args) {
        Lager lager = new Lager(5); // Lager mit maximal 5 Bestellungen

        // Lieferant und Kunde erstellen
        Thread lieferant = new Lieferant(lager);
        Thread kunde = new Kunde(lager);
        Thread lieferant1 = new Lieferant(lager);
        Thread kunde1 = new Kunde(lager);
        Thread lieferant2 = new Lieferant(lager);
        Thread kunde2 = new Kunde(lager);

        // Threads starten
        lieferant.start();
        kunde.start();
        lieferant1.start();
        kunde1.start();
        lieferant2.start();
        kunde2.start();

        // Warten auf den Abschluss der Threads
        try {
            lieferant.join();
            kunde.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Alle Bestellungen verarbeitet und abgeholt.");
    }
}
