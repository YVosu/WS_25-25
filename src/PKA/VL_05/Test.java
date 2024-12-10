package PKA.VL_05;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Klaus", 1961));
        personList.add(new Person("Peter", 1959));
        personList.add(new Person("Maria", 1959));
        personList.add(new Person("Petra", 1961));
        personList.add(new Person("Albert", 1959));
        personList.add(new Person("Anton", 1961));
        personList.add(new Person("Iris", 1959));
        personList.stream()
                .sorted(Comparator.comparing(Person::getName))
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);
    }
}
