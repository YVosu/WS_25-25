package PKA.VL_05;

import java.util.stream.IntStream;

public class PrimeCounter {
    public long countPrimes(int max) {
        return IntStream
                .range(1, max)
                .parallel()
                .filter(this::isPrime)
                .count();
    }

    private boolean isPrime(int number) {
        return IntStream
                .range(2, number)
                .allMatch(x -> (number % x) != 0);
    }
}
