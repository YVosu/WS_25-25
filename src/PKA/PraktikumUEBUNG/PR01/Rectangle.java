package PKA.PraktikumUEBUNG.PR01;

import PKA.VL_01.PR_01.Geometry;

public class Rectangle implements Geometry {
    private int breite;
    private int hoehe;

    public Rectangle(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return false;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hoehe;
        result = prime * result + breite;
        return result;
    }

    public String toString() {
        return "Rectangle HashCode: " + this.hashCode() + " Breite: " + breite + "Hoehe: " + hoehe;
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
