package PKA.VL_02.PR_02.Aufgabe_02;

public class Einkaufswagen<T extends Nahrungsmittel> {

    private static Nahrungsmittel[] produkte;
    private static int index;

    public Einkaufswagen(int maxGroesse) {
        produkte = new Nahrungsmittel[maxGroesse];
        index = 0;
    }

    public void hinzufuegen(T produkt) {
        if(index < produkte.length) {
            produkte[index++] = produkt;
        } else {
            System.out.println("Der Einkaufswagen ist voll.");
        }
    }

    public void ausgeben() {
        System.out.println("Waren im Einkaufswagen:");
        for(int i = 0; i < index; i++) {
            System.out.println(produkte[i].getName() + " - " + produkte[i].getPreis() + " EUR");
        }
    }

    public static <T extends Nahrungsmittel, X extends Number> void haushaltsbuch(T produkt, X menge) {
        float gesamtpreis = produkt.getPreis() * menge.floatValue();
        System.out.println("Produkt: " + produkt.getName() + ", Menge: " + menge + ", Gesamtpreis: " + gesamtpreis + " EUR");
    }
}
