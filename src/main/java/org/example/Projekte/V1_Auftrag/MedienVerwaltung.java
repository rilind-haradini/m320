package org.example.Projekte.V1_Auftrag;

import java.util.ArrayList;


class MedienVerwaltung {
    private ArrayList<Medien> medienListe = new ArrayList<>();

    public void hinzufuegen(Medien medium) {
        medienListe.add(medium);
    }

    public void entfernen(Medien medium) {
        medienListe.remove(medium);
    }

    public void anzeigen() {
        for (Medien medium : medienListe) {
            System.out.println(medium);
        }
    }
}
