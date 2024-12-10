package PKA.VL_02.Generics;

import java.awt.*;

public class TestTriplet {
    public static void main(String[] args) {
        var t1 = new Triplet<>("12", "abc", "10");
        System.out.println(t1.a + " " +  t1.b + " " + t1.c);

        var t2 = new Triplet<>(new Point(1, 1), new Point(2, 2), new Point(3, 3));
        var t3 = new Triplet<>(1.0, 2.8, 83.2);

    }

}
