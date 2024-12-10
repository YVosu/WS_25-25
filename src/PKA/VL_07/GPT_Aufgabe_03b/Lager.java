package PKA.VL_07.GPT_Aufgabe_03b;

import java.util.LinkedList;
import java.util.Queue;
class Lager {
    private final Queue<Integer> bestellungen = new LinkedList<>(); // Warteschlange für Bestellungen
    private final int maxKapazitaet; //grundlegend immer eine Art 'Cap'-Variable

    // Konstruktor
    public Lager(int maxKapazitaet) {
        this.maxKapazitaet = maxKapazitaet;
    }

    // Methode, um eine Bestellung hinzuzufügen
    public synchronized void hinzufuegen(int bestellung) throws InterruptedException {
        while (bestellungen.size() == maxKapazitaet) { // Warten, wenn das Lager voll ist
            System.out.println("Lager ist voll. Warten auf Abholung...");
            wait();
        }
        bestellungen.add(bestellung);
        System.out.println("Neue Bestellung aufgenommen: " + bestellung);
        notifyAll(); // Kunde benachrichtigen
    }

    // Methode, um eine Bestellung abzuholen
    public synchronized int abholen() throws InterruptedException {
        while (bestellungen.isEmpty()) { // Warten, wenn das Lager leer ist
            System.out.println("Lager ist leer. Warten auf neue Bestellungen...");
            wait();
        }
        int bestellung = bestellungen.poll();
        System.out.println("Bestellung abgeholt: " + bestellung);
        notifyAll(); // Produzent benachrichtigen
        return bestellung;
    }
}

// Thread für den Lieferanten (Produzent)
class Lieferant extends Thread {
    private final Lager lager;

    public Lieferant(Lager lager) {
        this.lager = lager;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) { // Der Lieferant liefert 10 Bestellungen
                lager.hinzufuegen(i); // Bestellung hinzufügen
                Thread.sleep(500); // Pause zur Nachverfolgbarkeit
            }
        } catch (InterruptedException e) {
            System.out.println("Lieferant unterbrochen: " + e.getMessage());
        }
    }
}

// Thread für den Kunden (Verbraucher)
class Kunde extends Thread {
    private final Lager lager;

    public Kunde(Lager lager) {
        this.lager = lager;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) { // Der Kunde holt 10 Bestellungen ab
                lager.abholen();
                Thread.sleep(1000); // Pause zur Nachverfolgbarkeit
            }
        } catch (InterruptedException e) {
            System.out.println("Kunde unterbrochen: " + e.getMessage());
        }
    }
}
