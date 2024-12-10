package PKA.VL_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 10, 9, 8, 7, 6, 1, 2, 3);
        numbers.stream()
                .skip(2)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);

        List<Person> personList = new ArrayList<>();
        personList.stream()
                .filter(person -> person.getAge() < 25)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Person> getPersonList = getPerson();
        getPersonList.stream()
                .forEach(System.out::println);

    }

    private static List<Person> getPerson() {
        return List.of(
                new Person("James Bond", 20),
                new Person("Jon Jones", 25),
                new Person("Freddie Mercury", 30),
                new Person("David Bowie", 55),
                new Person("Hedwig Owl", 7),
                new Person("Sirius Black", 31)
        );
    }

    public List<Integer> generate(int n) {
        return List.of(

        );
    }
}
