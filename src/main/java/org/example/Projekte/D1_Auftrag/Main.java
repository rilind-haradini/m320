package org.example.Projekte.D1_Auftrag;

import org.example.Projekte.D1_Auftrag.Time;

public class Main {
    public static void main(String[] args) {
    Time time = new Time(23, 59, 58);
        System.out.println(time);
                int temp = time.getHour();
                System.out.println(temp);

                int temp2 = time.getMinute();
                System.out.println(temp2);

                int temp3 = time.getSecond();
                System.out.println(temp3);

                time.nextSecond();
                int temp4 = time.getSecond();
                System.out.println(temp4);
    }
}

