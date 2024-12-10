package PKA.VL_07.GPT_Aufgabe_04;

import java.util.LinkedList;
import java.util.Queue;

public class Privatjet {

    private final Queue<Integer> sitzplaetze = new LinkedList<>();

    private final int maxSitzplatzKap;

    public Privatjet(int maxSitzplatzKap) {
        this.maxSitzplatzKap = maxSitzplatzKap;
    }

    public synchronized void besetzen(int wert) throws InterruptedException {
        while(sitzplaetze.size() == maxSitzplatzKap) {
            System.out.println("Alle Sitzplaetze sind belegt. Bitte warten.");
            wait();
        }
        sitzplaetze.add(wert);
        System.out.println("Neuer Sitzplatz belegt: " + wert);
        notifyAll();
    }

    public synchronized int aufgeben() throws InterruptedException {
        while (sitzplaetze.isEmpty()) {
            System.out.println("Alle Sitzplaetze sind frei. Sie koennen belegt werden.");
            wait();
        }
        int sitzplatz = sitzplaetze.poll();
        notifyAll();
        return sitzplatz;
    }
}

class PassengerBoarding extends Thread {
    private final Privatjet privatjet;

    public PassengerBoarding(Privatjet privatjet) {
        this.privatjet = privatjet;
    }

    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                privatjet.besetzen(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Boarding unterbrochen.");
        }
    }
}

class PassengerLeaving extends Thread  {
    private final Privatjet privatjet;

    public PassengerLeaving(Privatjet privatjet) {
        this.privatjet = privatjet;
    }

    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                privatjet.aufgeben();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Leaving unterbrochen.");
        }
    }
}
