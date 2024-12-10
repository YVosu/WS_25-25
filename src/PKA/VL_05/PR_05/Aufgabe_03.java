package PKA.VL_05.PR_05;

import java.util.Arrays;
import java.util.List;

public class Aufgabe_03 {
    public static void main(String[] args) {
        String lorem = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed "
                + "diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam "
                + "erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea "
                + "rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum "
                + "dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed "
                + "diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam "
                + "erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea "
                + "rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum "
                + "dolor sit amet.";

        List<String> longWords = Arrays.stream(lorem.split("\\W+"))
                .filter(word -> word.length() > 6)
                .toList();

        longWords.forEach(System.out::println);

    }
}
