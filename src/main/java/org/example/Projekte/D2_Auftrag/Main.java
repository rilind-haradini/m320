package org.example.Projekte.D2_Auftrag;

public class Main {
    public static void main(String[] args) {
        Class myClass = new Class();


        Student student1 = new Student("Test1");
        student1.addTest(new Test(90));
        student1.addTest(new Test(85));
        student1.addTest(new Test(88));
        myClass.addStudent(student1);

        Student student2 = new Student("Test2");
        student2.addTest(new Test(70));
        student2.addTest(new Test(75));
        student2.addTest(new Test(72));
        myClass.addStudent(student2);

        Student student3 = new Student("Test3");
        student3.addTest(new Test(60));
        student3.addTest(new Test(68));
        student3.addTest(new Test(65));
        myClass.addStudent(student3);


        System.out.println("Average grades for each student:");
        for (Student student : myClass.students) {
            System.out.println(student.name + ": " + student.getNotenschnitt());
        }

        System.out.println("Average grade for the class: " + myClass.getAverage());
    }
}