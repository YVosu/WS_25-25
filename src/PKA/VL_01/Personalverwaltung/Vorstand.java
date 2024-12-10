package PKA.VL_01.Personalverwaltung;

public class Vorstand extends Manager {

    private double abfindung;

    public Vorstand(String name, double gehalt, double bonus, double abfindung) {
        super(name, gehalt, bonus);
        this.abfindung = abfindung;
    }

    public double getAbfindung() {
        return abfindung;
    }

    void setAbfindung(double abfindung) {
        this.abfindung = abfindung;
    }
}
