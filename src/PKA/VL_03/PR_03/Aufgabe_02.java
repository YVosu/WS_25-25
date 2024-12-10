package PKA.VL_03.PR_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aufgabe_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> zahlenListe = new ArrayList<>();
        boolean weiter = true;

        // Zahlen eingeben und in der Liste speichern
        while (weiter) {
            // Zahleneingabe
            while (true) {
                try {
                    System.out.print("Geben Sie eine Zahl ein: ");
                    int zahl = Integer.parseInt(scanner.nextLine());
                    zahlenListe.add(zahl);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Das ist keine gültige Zahl! Bitte erneut versuchen.");
                }
            }

            // Frage, ob eine weitere Zahl eingegeben werden soll
            while (true) {
                System.out.print("Eine weitere Zahl (y/n)? ");
                String eingabe = scanner.nextLine().trim().toLowerCase();
                if (eingabe.equals("y")) {
                    break;
                } else if (eingabe.equals("n")) {
                    weiter = false;
                    break;
                } else {
                    System.out.println("'" + eingabe + "' ist nicht 'y' oder 'n'!");
                }
            }
        }

        // Ratespiel
        System.out.println("Jetzt beginnt das Ratespiel!");
        for (int i = 0; i < zahlenListe.size(); i++) {
            while (true) {
                try {
                    System.out.print("Wie lautet die " + (i + 1) + ". Zahl? ");
                    int rateZahl = Integer.parseInt(scanner.nextLine());
                    if (rateZahl == zahlenListe.get(i)) {
                        System.out.println("Richtig!");
                    } else {
                        System.out.println("Leider Falsch: " + zahlenListe.get(i) + " wäre richtig gewesen!");
                    }
                    break;  // Nächste Zahl abfragen
                } catch (NumberFormatException e) {
                    System.out.println("Das ist keine gültige Zahl! Bitte erneut versuchen.");
                }
            }
        }
        scanner.close();
    }
}

