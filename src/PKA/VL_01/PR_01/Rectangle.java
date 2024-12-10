package PKA.VL_01.PR_01;

public class Rectangle implements Geometry{
    int breite;
    int hoehe;

    public Rectangle(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public String toString() {
        return "Rectangle {hashCode = " + this.hashCode() + ", breite = " + breite + ", hoehe = " + hoehe + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hoehe;
        result = prime * result + breite;
        return result;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Wenn beide Objekte dieselbe Referenz haben, sind sie gleich
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Wenn das übergebene Objekt null oder ein anderes Objekt ist, sind sie nicht gleich
        }
        Rectangle other = (Rectangle) obj; // Cast auf Rectangle
        return breite == other.breite && hoehe == other.hoehe; // Vergleiche Attribute
    }


    @Override
    public double berechneUmfang() {
        return breite + breite + hoehe + hoehe;
    }

    @Override
    public double berechneFlaeche() {
        return breite * hoehe;
    }
}
