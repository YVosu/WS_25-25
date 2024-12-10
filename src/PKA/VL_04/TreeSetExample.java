package PKA.VL_04;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        //TreeSet sortiert die Elemente in natuerlicher Reihenfolge
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers);
    }
}
