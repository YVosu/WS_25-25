package PKA.VL_04.PR_04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Aufgabe_01 {
    public static void main(String[] args) {

        var random = new Random();
        var lottoZahl = new LinkedHashSet<>();

        do {
            lottoZahl.add(random.nextInt(49));
        } while (lottoZahl.size() < 6);
        System.out.println(lottoZahl);
    }
}
