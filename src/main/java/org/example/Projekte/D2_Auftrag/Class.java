package org.example.Projekte.D2_Auftrag;

import java.util.ArrayList;

class Class {
    ArrayList<Student> students;

    public Class() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public float getAverage() {
        if (students.isEmpty()) return 0;

        float total = 0;
        for (Student student : students) {
            total += student.getNotenschnitt();
        }
        return total / students.size();
    }
}
