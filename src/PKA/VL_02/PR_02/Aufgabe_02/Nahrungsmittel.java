package PKA.VL_02.PR_02.Aufgabe_02;

public abstract class Nahrungsmittel {
    private String name;
    private float preis;

    public Nahrungsmittel(String name, float preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public float getPreis() {
        return preis;
    }
}
