package PKA.VL_02.PR_02.Aufgabe_02;

import PKA.VL_02.PR_02.Aufgabe_02.*;

import java.util.Objects;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "y";

        var allProdukt_wagen = new Einkaufswagen<>(10);
        var brot_wagen = new Einkaufswagen<Brot>(10);
        var kaese_wagen = new Einkaufswagen<Kaese>(10);
        var kuehl_wagen = new Einkaufswagen<Frischkaese>(10);

        Brot brot1 = new Brot("Vollkornbrot", 2.99f);
        Brot brot2 = new Brot("Baguette", 3.99f);
        Kaese kaese1 = new Kaese("Gouda", 3.49f);
        Kaese kaese2 = new Kaese("Parmesan", 4.99f);
        Wurst wurst1 = new Wurst("Salami", 4.49f);
        Wurst wurst2 = new Wurst("Chorizo", 5.69f);
        Frischkaese frischkaese1 = new Frischkaese("Ricotta", 8.99f);
        Frischkaese frischkaese2 = new Frischkaese("Quark", 1.99f);
        Superfrischkaese superfrischkaese1 = new Superfrischkaese("Mozarella", 2.49f);
        Superfrischkaese superfrischkaese2 = new Superfrischkaese("Mascarpone", 4.55f);

        while(!Objects.equals(input, "q")) {
            System.out.println("Um das Programm zu beenden, drücken Sie 'q'.");
            input = scanner.nextLine();

            System.out.println("Waehlen Sie Ihren Einkaufswagen aus.\n 1. All-Produkt Wagen\n 2. Brot Wagen\n 3. Kaese Wagen\n 4. Einkaufswagen mit Kuehlfunktion");
            int wagen_auswahl = scanner.nextInt();
            if(wagen_auswahl == 1) {
                System.out.println("All-Produkt Wagen");
            } else if(wagen_auswahl == 2) {
                System.out.println("Brot Wagen");
            } else if(wagen_auswahl == 3) {
                System.out.println("Kaese Wagen");
            } else if(wagen_auswahl == 4) {
                System.out.println("Einkaufswagen mit Kuehlfunktion");
            }
        }
    }
}
