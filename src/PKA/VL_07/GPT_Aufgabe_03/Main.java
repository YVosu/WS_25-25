package PKA.VL_07.GPT_Aufgabe_03;

public class Main {
    public static void main(String[] args) {
        Puffer puffer = new Puffer(5);

        Thread producer = new Producer(puffer);
        Thread consumer = new Producer(puffer);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
