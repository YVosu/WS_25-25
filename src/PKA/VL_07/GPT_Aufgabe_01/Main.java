package PKA.VL_07.GPT_Aufgabe_01;

public class Main {
    public static void main(String[] args) {
        Thread countdownThread = new Thread(new Countdown());

        countdownThread.start();
    }
}
