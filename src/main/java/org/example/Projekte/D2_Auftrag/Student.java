package org.example.Projekte.D2_Auftrag;

import java.util.ArrayList;

class Student {
    String name;
    private ArrayList<Test> tests;

    public Student(String name) {
        this.name = name;
        this.tests = new ArrayList<>();
    }

    public void addTest(Test test) {
        this.tests.add(test);
    }

    public float getNotenschnitt() {
        if (tests.isEmpty()) return 0;

        float total = 0;
        for (Test test : tests) {
            total += test.calculateGrade();
        }
        return total / tests.size();
    }
}
