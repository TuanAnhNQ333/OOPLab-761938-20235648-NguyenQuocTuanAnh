/**
 * 6.3 : Write a program to display a triangle with a height of n stars (*), n is entered by users
 */
package hust.soict.hedspi.lab1.Exercises;

import java.util.Scanner;

public class Triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chieu cao n: ");
        int n = scanner.nextInt();
        scanner.close();

        for(int i = 1; i <= n; i ++) {
            for(int j = 0; j < n - i; j ++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (2 * i - 1); j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
