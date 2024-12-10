package PKA.VL_05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GPT_Aufgaben {
    public static void main(String[] args) {

        //Aufgabe 01
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numberList.stream()
                .filter(n -> (n % 2) == 0)
                .forEach(System.out::println);

        //Aufgabe 02
        List<String> nameList = Arrays.asList("James", "Remus", "Sirius", "Peter");
        List<String> upperCaseNameList = nameList.stream()
                .map(String::toUpperCase)
                .toList();

        upperCaseNameList.forEach(System.out::println);

        //so geht es auch
        List<String> nameList2 = Arrays.asList("Prongs", "Moony", "Padfoot", "Wormtail");
        nameList2.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Aufgabe 03
        List<Integer> zahlenListe = Arrays.asList(12, 15, 17, 19, 23, 24, 26, 28);
        zahlenListe.stream()
                .reduce((a, b) -> a + b);
        zahlenListe.forEach(System.out::println);

        IntStream s6 = IntStream.range(1, 10);
        s6.forEach(System.out::println);
    }
}
