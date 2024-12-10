package PKA.VL_07;

public class ThreadExample extends Thread{
    public void run() {
        System.out.println("Thread laeuft...");
    }
}

class ThreadExample2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable laeuft...");
    }
}
