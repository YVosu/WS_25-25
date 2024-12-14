package PKA.VL_01.PR_01v2;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus() {
        this.bonus = bonus;
    }

    
}
