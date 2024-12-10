package PKA.VL_04;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Fred");
        names.add("Bill");
        names.add("Charlie");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.indexOf(i));
        }

        for(String name: names) {
            System.out.println(name);
        }

    }
}
