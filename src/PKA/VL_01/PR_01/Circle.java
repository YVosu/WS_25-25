package PKA.VL_01.PR_01;

public class Circle implements Geometry{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }
}
