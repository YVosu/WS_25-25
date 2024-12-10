package PKA.VL_05;

import java.util.stream.IntStream;

public class Parallel {
    public static void main(String[] args) {

        int max = 100_000;

        PrimeCounter pc = new PrimeCounter();
        long time = -System.currentTimeMillis();
        System.out.println(pc.countPrimes(max));
        System.out.println(time + System.currentTimeMillis() + "ms");

    }
}
