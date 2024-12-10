package PKA.VL_04;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Schmierblatt {
    public static void main(String[] args) {
        var rnd = new Random();
        var lotto = new TreeSet<>();

        do {
            lotto.add(rnd.nextInt(49));
        } while (lotto.size() < 6);
        System.out.println(lotto);
    }
}
