package PKA.VL_01.Personalverwaltung;

public class Manager extends Angestellter{

    private double bonus;

    public Manager(String name, double gehalt, double bonus) {
        super(name, gehalt);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    void setBonus(double bonus) {
        this.bonus = bonus;
    }

    double berechneJahreszahlung() {
        return super.berechneJahreszahlung() + bonus;
    }
}
