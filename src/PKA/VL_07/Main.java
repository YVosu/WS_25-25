package PKA.VL_07;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ZaehlerAbwaerts());
        Thread thread2 = new Thread(new ZaehlerAufwaerts());

        Thread thread3 = new Thread(new Countdown());
        thread3.start();
    }
}

class ZaehlerAufwaerts implements Runnable {
    public void run() {
        for (int i = 1; i <=10; i++){
            System.out.println("Aufwaerts: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread unterbrochen");
            }
        }
    }
}

class ZaehlerAbwaerts implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Abwaerts: " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Thread unterbrochen");
            }
        }
    }
}

class Countdown extends Thread {
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread unterbrochen");
            }
        }
    }
}
