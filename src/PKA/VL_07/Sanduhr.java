package PKA.VL_07;

public class Sanduhr {
    private volatile boolean fertig = false;

    public static void main(String[] args){
        Sanduhr sanduhr = new Sanduhr();
        sanduhr.dauertLange();
    }

    public void dauertLange() {
        System.out.println("Achtung! Das dauert jetzt ein bisschen.");

        Thread punktThread = new Thread(() -> {
            while (!fertig) {
                System.out.print(".");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Punkt-Thread wurde unterbrochen.");
                }
            }
        });

        punktThread.start();

        try {
            Thread.sleep((long)(Math.random() * 5000) + 5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        fertig = true;
        try {
            punktThread.join();
        } catch (InterruptedException e) {
            System.out.println("Fehler beim Warten auf den Punkt-Thread.");
        }

        System.out.println("\nEndlich vorbei!");
    }
}



