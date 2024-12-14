package PKA.PraktikumUEBUNG.PR01;

import PKA.VL_01.PR_01.Geometry;

public class Circle implements Geometry {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double berechneUmfang() {
        return 0;
    }

    @Override
    public double berechneFlaeche() {
        return 0;
    }
}
