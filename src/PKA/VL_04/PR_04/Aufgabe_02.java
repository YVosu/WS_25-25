package PKA.VL_04.PR_04;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Aufgabe_02 {

    public static <T>HashSet<T> schnitt(HashSet<T> setA, HashSet<T> setB) {
        HashSet<T> result = new HashSet<>(setA);
        result.retainAll(setB);
        return result;
    }

    public static <T>HashSet<T> vereinigung(HashSet<T> setA, HashSet<T> setB) {
        HashSet<T> result = new HashSet<>(setA);
        result.addAll(setB);
        return result;
    }

    public static <T>HashSet<T> differenz(HashSet<T> setA, HashSet<T> setB) {
        HashSet<T> result = new HashSet<>(setA);
        result.removeAll(setB);
        return result;
    }

    public static <T> void printSet(String title, HashSet<T> set) {
        System.out.println(title);
        for (T element : set) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        HashSet<String> setA = new HashSet<>();
        setA.add("a");
        setA.add("b");
        setA.add("c");

        HashSet<String> setB = new HashSet<>();
        setB.add("b");
        setB.add("c");
        setB.add("d");

        printSet("Menge A", setA);
        printSet("Menge B", setB);

        HashSet<String> schnittSet = schnitt(setA, setB);
        printSet("Durchschnitt von A und B", schnittSet);

        HashSet<String> vereinigungSet = vereinigung(setA, setB);
        printSet("Vereinigung von A und B", vereinigungSet);

        HashSet<String> differenzSet = differenz(setA, setB);
        printSet("Differenz von A und B", differenzSet);

        HashSet<Integer> setC = new HashSet<>();
        setC.add(10);
        setC.add(20);
        setC.add(30);

        HashSet<Integer> setD = new HashSet<>();
        setD.add(20);
        setD.add(30);
        setD.add(40);

        HashSet<Integer> schnittSetInt = schnitt(setC, setD);
        printSet("Schnitt von C und D", schnittSetInt);

    }
}
