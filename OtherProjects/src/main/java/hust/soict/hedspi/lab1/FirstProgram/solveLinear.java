/**
 * 2.2.6
 * 2.2.6 Write a program to solve:
 * For simplicity, we only consider the real roots of the equations in this task.
 *
 * - The first-degree equation (linear equation) with one variable
 *
 * Note: A first-degree equation with one variable can have a form such as ax + b = 0 (a ≠ 0).
 * You should handle the case where the user input value 0 for a.
 *
 * Don't forget to add and commit your work using ‘git add .’ and ‘git commit -m <message>’ command
 *
 * - The system of first-degree equations (linear system) with two variables
 *
 * Note: A system of first-degree equations with two variables x1 and x2 can be written as follows.
 *
 * a11 x1 + a12 x2 = b1
 * a21 x1 + a22 x2 = b2
 *
 * You should handle the case where the values of the coefficients produce infinitely many solutions and the case where they produce no solution.
 *
 * Hint:
 * Use the following determinants:
 *
 * D  = |a11 a12|
 *      |a21 a22| = a11a22 − a21a12
 *
 * D1 = |b1  a12|
 *      |b2  a22| = b1a22 − b2a12
 *
 * D2 = |a11 b1 |
 *      |a21 b2 | = a11b2 − a21b1
 *
 * - The second-degree equation with one variable
 *
 * Note: A second-degree equation with one variable (i.e., quadratic equation) can have a form such as ax² + bx + c = 0, where x is the variable, and a, b, and c are coefficients (a ≠ 0).
 *
 * You should handle the case where the values of the coefficients produce a double root & the case where they produce no root. You should also handle the case where the user input value 0 for a.
 *
 * Hint:
 * Use the discriminant Δ = b² − 4ac
 */

package hust.soict.hedspi.lab1.FirstProgram;

import java.util.Scanner;


public class  solveLinear{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0)
                System.out.println("Infinite solutions");
            else
                System.out.println("No solution");
        } else {
            double x = -b / a;
            System.out.println("Solution x = " + x);
        }

        sc.close();
    }
}
