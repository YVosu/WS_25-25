package PKA.VL_03;

public class Main {
    public static void main(String[] args) {

        MyInterface myInterface = () -> System.out.println("Hello World");
        myInterface.message();
    }
}
