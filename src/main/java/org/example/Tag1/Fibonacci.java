package org.example.Tag1;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Herzlich Willkommen zur Fibonacci-App!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die maximale Zahl ein: ");
        int max = scanner.nextInt();

        fibonacci(max);

        scanner.close();
    }

    public static void fibonacci(int max) {
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.print("Fibonacci-Zahlen bis zur maximalen Zahl " + max + ":");

        while(n3 <= max) {
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        System.out.println();
    }
}
