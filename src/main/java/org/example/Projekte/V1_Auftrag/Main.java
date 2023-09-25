package org.example.Projekte.V1_Auftrag;

public class Main {
    public static void main(String[] args) {
        MedienVerwaltung verwaltung = new MedienVerwaltung();

        DVD filmA = new DVD("Film A", 2000, 15.99, 120);
        verwaltung.hinzufuegen(filmA);
        verwaltung.hinzufuegen(new CD("Album B", 2005, 9.99, "Band XY"));
        verwaltung.hinzufuegen(new Buch("Buch C", 2010, 19.99, "123"));

        verwaltung.anzeigen();

        System.out.println("+-------------------------------------------+");

        verwaltung.entfernen(filmA);
        verwaltung.anzeigen();
    }
}