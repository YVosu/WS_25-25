package PKA.VL_03.PR_03;

import java.time.LocalDateTime;

public class Termin {
    private String beschreibung;
    private String ort;
    private LocalDateTime zeitpunkt;

    // Konstruktor
    public Termin(String beschreibung, String ort, LocalDateTime zeitpunkt) {
        this.beschreibung = beschreibung;
        this.ort = ort;
        this.zeitpunkt = zeitpunkt;
    }

    // Getter und Setter
    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public LocalDateTime getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(LocalDateTime zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    // toString-Methode für Ausgabe
    @Override
    public String toString() {
        return "Termin: " + beschreibung + ", Ort: " + ort + ", Zeitpunkt: " + zeitpunkt;
    }
}

