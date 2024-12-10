package PKA.VL_03.PR_03;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongComparable extends AtomicLong implements Comparable<AtomicLongComparable>{

    public AtomicLongComparable() {
        super();
    }

    public AtomicLongComparable(long initialValue) {
        super(initialValue);
    }

    @Override
    public int compareTo(AtomicLongComparable o) {
        return Long.compare(this.get(), o.get());
    }

    @Override
    public String toString() {
        return Long.toString(this.get());
    }
}
