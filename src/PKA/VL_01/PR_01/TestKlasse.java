package PKA.VL_01.PR_01;

import java.sql.Ref;

public class TestKlasse {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(10, 15);
        Rectangle rec2 = new Rectangle(30, 45);
        Rectangle rec3 = new Rectangle(10, 15);

        //Aufgabe 1)
        System.out.println(rec1.equals(rec2));
        System.out.println(rec1.toString());
        System.out.println(rec2.toString());
        System.out.println(rec1.equals(rec3));

        //Aufgabe 2)
        Rectangle[] rectangleArray = new Rectangle[4];
        rectangleArray[0] = new Rectangle(10, 20);
        rectangleArray[1] = new Rectangle(30, 40);
        rectangleArray[2] = new Rectangle(50, 60);
        rectangleArray[3] = new Rectangle(70, 80);

        Circle[] circleArray = new Circle[4];
        circleArray[0] = new Circle(10);
        circleArray[1] = new Circle(20);
        circleArray[2] = new Circle(30);
        circleArray[3] = new Circle(40);

        for(int i = 0; i < rectangleArray.length; i++) {
            System.out.println("Werte von Rechteck " + (i + 1) + ":");
            System.out.println(rectangleArray[i]);
            System.out.println("Flaeche: " + rectangleArray[i].berechneFlaeche());
            System.out.println("Umfang: " + rectangleArray[i].berechneUmfang());
            System.out.println();
        }

        for(int i = 0; i < circleArray.length; i++) {
            System.out.println("Werte von Kreis " + (i + 1) + ": ");
            System.out.println("Radius: " + circleArray[i].radius);
            System.out.println("Flaeche: " + circleArray[i].berechneFlaeche());
            System.out.println("Umfang: " + circleArray[i].berechneUmfang());
            System.out.println();
        }

        //Aufgabe 3)
        Person person1 = new Person("Valentin", "Bochum", "Nordring", "44787");
        Person person2 = new Person("Valentin", "Bochum", "Nordring", "44787");

        System.out.println("Testfall 1: Zwei gleiche Personen");
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("Sind Person 1 und Person 2 gleich? " + person1.equals(person2));
        System.out.println();

        // Testfall 2: Unterschiedliche Straßen
        person2.setStreet("Second Street");
        System.out.println("Testfall 2: Unterschiedliche Straßen");
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("Sind Person 1 und Person 2 gleich? " + person1.equals(person2));
        System.out.println();

        // Testfall 3: Unterschiedliche Namen
        Person person3 = new Person("Bob", "Berlin", "Main Street", "12345");
        System.out.println("Testfall 3: Unterschiedliche Namen");
        System.out.println("Person 1: " + person1);
        System.out.println("Person 3: " + person3);
        System.out.println("Sind Person 1 und Person 3 gleich? " + person1.equals(person3));
        System.out.println();

        // Testfall 4: Unterschiedliche PLZ
        person1.setZipcode("54321");
        System.out.println("Testfall 4: Unterschiedliche PLZ");
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("Sind Person 1 und Person 2 gleich? " + person1.equals(person2));


        //Aufgabe 4)
        RefinedPerson refinedPerson1 = new RefinedPerson("Dennis", "Bochum", "Westring", "44889", "Bubi");
        RefinedPerson refinedPerson2 = new RefinedPerson("Dennis", "Bochum", "Westring", "44889", "Buba");

        refinedPerson2.setNickname("Bubi");
        System.out.println(refinedPerson1.equals(refinedPerson2));
    }
}
