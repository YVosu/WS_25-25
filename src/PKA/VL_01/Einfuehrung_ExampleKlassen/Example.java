package PKA.VL_01.Einfuehrung_ExampleKlassen;

import java.sql.SQLOutput;

public class Example {
    public static void main(String[] args) throws InterruptedException{
        int END = Integer.MAX_VALUE;
        int START = END - 100;
        int count = 0;
        for(int i = START; i <= END; i++) {
            count++;
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println(count);
    }
}

class Example2 {
    public static void main(String[] args){
        String oneMillionHello = "";
        for(int i = 0; i < 1_000_000; i++) {
            oneMillionHello = oneMillionHello + "Hello";
        }
        System.out.println(oneMillionHello.substring(0, 6));
    }
}

class Example3 {
    public static void main(String[] args) {
        StringBuilder oneMillionHelloSB = new StringBuilder();
        for(int i = 0; i < 1_000_000; i++) {
            oneMillionHelloSB.append("Hello");
        }
        System.out.println(oneMillionHelloSB.substring(0, 6));
    }
}
