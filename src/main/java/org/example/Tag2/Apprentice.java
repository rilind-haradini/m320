package org.example.Tag2;

// Apprentice abhängig von Human.
public class Apprentice extends Human {
    private String topic; // Thema des Lehrlings

    // Konstruktor für Apprentice mit Thema und Name
    public Apprentice(String topic, String name) {
        super(name); // Aufruf des Human-Konstruktors mit dem Namen
        this.topic = topic; // Initialisierung des Lehrlingsthemas
    }

    // Methode zur Anzeige von Name und Thema
    public void displayInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Topic: " + topic);
    }

    // Methode zur Rückgabe des Themas
    public String getTopic() {
        return topic;
    }
}

/////////////////////////Main/////////////////////
/*Apprentice apprentice = new Apprentice("Programming", "Rilind");
 apprentice.displayInformation();*/
