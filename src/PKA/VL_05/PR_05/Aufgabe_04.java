package PKA.VL_05.PR_05;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Aufgabe_04 {

    public static BigDecimal factorial(BigInteger n) {
        // Für kleine Werte von n verwenden wir einen seriellen Stream
        if (n.compareTo(BigInteger.valueOf(20)) <= 0) {
            return LongStream.rangeClosed(1, n.longValue())
                    .mapToObj(BigInteger::valueOf)
                    .reduce(BigDecimal.ONE, (acc, x) -> acc.multiply(new BigDecimal(x)), BigDecimal::multiply);
        } else {
            // Für größere Werte von n verwenden wir einen parallelen Stream
            return LongStream.rangeClosed(1, n.longValue())
                    .parallel()
                    .mapToObj(BigInteger::valueOf)
                    .reduce(BigDecimal.ONE, (acc, x) -> acc.multiply(new BigDecimal(x)), BigDecimal::multiply);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine nicht-negative ganze Zahl für die Fakultätsberechnung ein: ");
        String input = scanner.nextLine();

        try {
            BigInteger n = new BigInteger(input);
            if (n.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("Die Zahl muss nicht-negativ sein.");
            } else {
                BigDecimal result = factorial(n);
                System.out.println("Die Fakultät von " + n + " ist: " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
        }

        scanner.close();
    }
}

