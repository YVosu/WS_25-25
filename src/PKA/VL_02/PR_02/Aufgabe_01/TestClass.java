package PKA.VL_02.PR_02.Aufgabe_01;

import PKA.VL_02.PR_02.Aufgabe_02.Einkaufswagen;
import PKA.VL_02.PR_02.Aufgabe_02.Nahrungsmittel;

public class TestClass {
    public <T extends ClassHierarchy.C> void testCreate(MyGenerics<T> obj) {
        System.out.println("Objekt akzeptiert: " + obj.getClass().getName());
    }

    public static void main(String[] args) {
        TestClass test = new TestClass();

        //Korrekte Aufrufe
        MyGenerics<ClassHierarchy.C> objC = new MyGenerics<>(); //ruft den Standardkonstruktor auf
        MyGenerics<ClassHierarchy.D> objD = new MyGenerics<>();
        test.testCreate(objC);
        test.testCreate(objD);

        MyGenerics<ClassHierarchy.A> objA = new MyGenerics<>();
        //test.testCreate(objA); Fehler
    }
}
