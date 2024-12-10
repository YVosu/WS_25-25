package PKA.VL_01.Personalverwaltung;

public class Angestellter {
    private String name;
    private double gehalt;

    public Angestellter(String name, double gehalt) {
        this.name = name;
        this.gehalt = gehalt;
    }

    public String getName() {
        return name;
    }

    public double getGehalt() {
        return gehalt;
    }

    void setName(String name) {
        this.name = name;
    }

    void setGehalt(double Gehalt) {
        this.gehalt = gehalt;
    }

    double berechneJahreszahlung() {
        return 12 * gehalt;
    }
}
