package PKA.VL_04;

import com.sun.source.tree.Tree;

import java.awt.*;
import java.util.*;

import static java.util.Map.entry;

public class Main {
    public static void main(String[] args) {

        var rnd = new Random();
        var lotto = new TreeSet<>();
        do {
            lotto.add(rnd.nextInt(49));
        } while (lotto.size() < 6);
        System.out.println(Arrays.toString(lotto.toArray()));

        System.out.println();

        var lottoZahlen = new TreeSet<>();
        while(lottoZahlen.size() < 6) {
            lottoZahlen.add(1 + rnd.nextInt(49));
        }
        System.out.println(Arrays.toString(lotto.toArray()));




//        Map<String, String> dict = new HashMap<>();
//        dict.put("one", "eins");
//        dict.put("two", "zwei");
//        dict.put("three", "drei");
//        dict.put("four", "view");
//        System.out.println(dict.get("three"));
//
//        //Map.of akzeptiert maximal 10 Key-Value Paare
//        var dict2 = Map.of("one", "eins", "two", "zwei", "three", "drei", "four", "vier");
//
//        //beliebig viele Key-Value Paare
//        Map<String, String> dict3 = Map.ofEntries(entry("one", "eins"), entry("two", "zwei"), entry("three", "drei"), entry("four", "vier"));
    }
}
