package PKA.VL_01.PR_01v2;

public class Board extends Manager {

    private double abfindung;

    public Board(String name, double salary, double bonus, double abfindung) {
        super(name, salary, bonus);
        this.abfindung = abfindung;
    }
}
