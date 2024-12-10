package PKA.Schmierblatt;

import java.util.List;

public class MyList<E> implements Comparable {
    private List<E> elements;

    public void add(E element) {
        elements.add(element);
    }

    public E get(int index) {
        return elements.get(index);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
