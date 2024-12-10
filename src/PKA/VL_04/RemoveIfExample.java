package PKA.VL_04;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class RemoveIfExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        //removeIf erlaubt das Entfernen von Elementen basierend auf einer Bedingung
        numbers.removeIf(n -> n < 4);
        System.out.println(numbers);


    }
}
