package PKA.VL_02.Generics;

public class TestGenericMethods {
    public static void main(String[] args) {
        String s = max("abc", "efg");
        Integer n = max(123, 456);
        System.out.println(s);
        System.out.println(n);


    }

    public static <T extends Comparable<T>> T max(T a, T b) {
        if(a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}
