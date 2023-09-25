package org.example.Projekte.V1_Auftrag;

// DVD Klasse
class DVD extends Medien {
    private int filmlaenge;

    public DVD(String titel, int jahr, double preis, int filmlaenge) {
        super(titel, jahr, preis);
        this.filmlaenge = filmlaenge;
    }

    @Override
    public String toString() {
        return super.toString() + ", Filmlänge: " + filmlaenge;
    }
}
