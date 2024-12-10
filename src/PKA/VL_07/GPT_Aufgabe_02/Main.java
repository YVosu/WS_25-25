package PKA.VL_07.GPT_Aufgabe_02;

public class Main {
    public static void main(String[] args) {
        BankKonto bankKonto = new BankKonto();

        Thread einzahlThread = new EinzahlThread(bankKonto);
        Thread abhebThread = new AbhebThread(bankKonto);

        einzahlThread.start();
        abhebThread.start();

        try {
            einzahlThread.join();
            abhebThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finaler Kontostand: " + bankKonto.getKontostand() + " Euro.");
    }
}
