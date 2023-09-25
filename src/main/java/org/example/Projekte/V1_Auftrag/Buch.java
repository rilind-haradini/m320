package org.example.Projekte.V1_Auftrag;


// Buch Klasse
class Buch extends Medien {
    private String isbn;

    public Buch(String titel, int jahr, double preis, String isbn) {
        super(titel, jahr, preis);
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return super.toString() + ", isbn: " + isbn;
    }
}

