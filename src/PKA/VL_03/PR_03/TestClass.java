package PKA.VL_03.PR_03;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<AtomicLongComparable> lngLst = new ArrayList<>();
        lngLst.add(new AtomicLongComparable());
        lngLst.add(new AtomicLongComparable(99));
        lngLst.add(new AtomicLongComparable(42));

        System.out.println("Das Maximum ist: " + findeMaximum(lngLst));
    }

    public static AtomicLongComparable findeMaximum(List<AtomicLongComparable> list) {
        if(list == null || list.isEmpty())  {
            throw new IllegalArgumentException("Liste darf nicht leer sein.");
        }

        AtomicLongComparable max = list.get(0);
        for(AtomicLongComparable element : list) {
            if(element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
