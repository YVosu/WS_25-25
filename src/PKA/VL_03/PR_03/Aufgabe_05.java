package PKA.VL_03.PR_03;

import java.util.Arrays;

public class Aufgabe_05 {
    public static void main(String[] args) {
        Integer[] data = {1, 2, 3};
        var lst = Arrays.asList(data);
        lst.forEach(System.out::println);

        lst.forEach(i -> System.out.println(i));
    }
}
