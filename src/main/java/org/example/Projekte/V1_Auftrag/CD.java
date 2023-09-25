package org.example.Projekte.V1_Auftrag;

// CD Klasse
class CD extends Medien {
    private String bandname;

    public CD(String titel, int jahr, double preis, String bandname) {
        super(titel, jahr, preis);
        this.bandname = bandname;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bandname: " + bandname;
    }
}
