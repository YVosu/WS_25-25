package PKA.VL_07.GPT_Aufgabe_03;

import java.util.LinkedList;
import java.util.Queue;

public class Puffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int maxSize;

    public Puffer(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized void produzieren(int wert) throws InterruptedException {
        while (queue.size() == maxSize) {
            System.out.println("Puffer ist voll. Produzent wartet...");
            wait();
        }
        queue.add(wert);
        System.out.println("Produziert:" + wert);
        notifyAll();
    }

    public synchronized int konsumieren() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Puffer ist leer. Verbraucher wartet...");
            wait();
        }
        int wert = queue.poll();
        System.out.println("Konsumiert: " + wert);
        notifyAll();
        return wert;
    }
}

class Producer extends Thread {
    private final Puffer puffer;

    public Producer(Puffer puffer) {
        this.puffer = puffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int wert = (int) (Math.random() * 100 + 1);
                puffer.produzieren(wert);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Produzent unterbrochen: " + e.getMessage());
        }
    }
}

class Consumer extends Thread {
    private final Puffer puffer;

    public Consumer(Puffer puffer) {
        this.puffer = puffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                puffer.konsumieren();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Verbraucher unterbrochen: " + e.getMessage());
        }
    }
}
