package PKA.VL_05.PR_05;

import java.util.Random;

public class Aufgabe_01 {
    public static void main(String[] args) {

        new Random().ints()
                .map(n -> Math.abs(n) % 1000)
                .peek(System.out::println)
                .anyMatch(n -> 10 <= n && n < 20);
    }
}
