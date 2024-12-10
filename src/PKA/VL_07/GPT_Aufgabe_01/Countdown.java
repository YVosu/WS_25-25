package PKA.VL_07.GPT_Aufgabe_01;

public class Countdown extends Thread {
    public void run() {
        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
