package PKA.VL_01.Personalverwaltung;

import PKA.VL_01.Personalverwaltung.Angestellter;
import PKA.VL_01.Personalverwaltung.Manager;
import PKA.VL_01.Personalverwaltung.Vorstand;

public class TestKlasse {
    public static void main(String[] args) {
//        Manager m1 = new Manager("Bill Gates", 100_000.00, 50_000.00);
//        Angestellter a1 = new Angestellter("Meier", 5000.00);
//        System.out.println(m1.getName() + " Gehalt: " + m1.getGehalt() + "/ Bonus: " + m1.getBonus());
//        System.out.println(a1.getName() + " Gehalt: " + a1.getGehalt());

        Angestellter a = new Angestellter("Meier", 5000.00);
        Angestellter b = a;
        Angestellter c = new Angestellter("Meier", 5000.00);
        System.out.println("1. " + (a == b));
        System.out.println("2. " + (a == c));
        System.out.println("3. " + (a.equals(c)));

        //Eine Referenz von Typ Angestellter kann auf ein Objekt einer Unterklasse von Angestellter verweisen
        Angestellter chef = new Vorstand("Jordan", 1.00, 5.00, 10.00);
    }
}
