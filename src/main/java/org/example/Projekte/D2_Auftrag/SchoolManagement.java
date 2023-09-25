package org.example.Projekte.D2_Auftrag;


import java.util.Scanner;

public class SchoolManagement {
    public static void main(String[] args) {
        Class myClass = new Class();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Geben Sie den Namen des Studenten ein: ");
            String name = sc.nextLine();
            Student student = new Student(name);

            for (int j = 0; j < 3; j++) {
                System.out.print("Geben Sie die Punktzahl für Test " + (j + 1) + " ein: ");
                int points = sc.nextInt();
                student.addTest(new Test(points));
            }
            sc.nextLine();

            myClass.addStudent(student);
        }

        System.out.println("\nDurchschnittsnote pro Student:");
        for (Student student : myClass.students) {
            System.out.println(student.name + ": " + student.getNotenschnitt());
        }

        System.out.println("\nDurchschnittsnote der Klasse: " + myClass.getAverage());
    }
}
