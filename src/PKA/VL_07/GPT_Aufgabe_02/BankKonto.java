package PKA.VL_07.GPT_Aufgabe_02;

public class BankKonto {
    private int kontostand = 0;

    public synchronized void einzahlen(int betrag) {
        kontostand += betrag;
        System.out.println(Thread.currentThread().getName() + " hat " + betrag + " Euro eingezahlt. Kontostand: " + kontostand);
    }

    public synchronized void abheben(int betrag) {
        if (kontostand >= betrag) {
            kontostand -= betrag;
            System.out.println(Thread.currentThread().getName() + " hat " + betrag + " Euro abgehoben. Kontostand: " + kontostand);
        } else {
            System.out.println(Thread.currentThread().getName() + " wollte " + betrag + " Euro abheben, aber der Kontostand ist zu niedrig.");
        }
    }

    public int getKontostand() {
        return kontostand;
    }
}

class EinzahlThread extends Thread {
    private final BankKonto konto;

    public EinzahlThread(BankKonto konto) {
        this.konto = konto;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            konto.einzahlen(1000);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread unterbrochen");
            }
        }
    }
}

class AbhebThread extends Thread {
    private final BankKonto konto;

    public AbhebThread(BankKonto konto) {
        this.konto = konto;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            konto.abheben(500);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread unterbrochen");
            }
        }
    }
}