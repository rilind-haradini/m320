package org.example.Projekte.V1_Auftrag;


class Medien {
    private String titel;
    private int jahr;
    private double preis;

    public Medien(String titel, int jahr, double preis) {
        this.titel = titel;
        this.jahr = jahr;
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Titel: " + titel + ", Jahr: " + jahr + ", Preis: " + preis;
    }
}
