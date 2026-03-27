package com.example.oop_lab.lab1.FirstProgram;


import java.util.Scanner;

public class twoEquation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        if (a == 0) {

            if (b == 0) {
                if (c == 0)
                    System.out.println("Infinite solutions");
                else
                    System.out.println("No solution");
            } else {
                double x = -c / b;
                System.out.println("Linear solution x = " + x);
            }

        } else {

            double delta = b * b - 4 * a * c;

            if (delta > 0) {

                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            } else if (delta == 0) {

                double x = -b / (2 * a);
                System.out.println("Double root x = " + x);

            } else {

                System.out.println("No real root");

            }
        }

        sc.close();
    }
}