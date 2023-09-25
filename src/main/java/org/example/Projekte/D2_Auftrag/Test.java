package org.example.Projekte.D2_Auftrag;

class Test {
    private int points;
    private static final int TOTAL_POINTS = 100;

    public Test(int points) {
        this.points = points;
    }

    public float calculateGrade() {
        return (float) points * 5 / TOTAL_POINTS + 1;
    }
}
