package com.example.oop_lab.lab1.Exercises;

import java.util.Scanner;

public class TwoMatrices {
    public static int [][] createMatrix(int rows, int cols, Scanner sc) {
        int [][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrices: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static int [][] addMatrix(int [][] A, int [][] B) {
        int rows = A.length;
        int cols = A[0].length;

        int [][] result = new int[rows][cols] ;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int [][] matrix) {
        System.out.println("The result of the matrix is : ");
        for(int i = 0; i < matrix.length; i ++) {
            for(int j = 0; j < matrix[0].length; j ++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int [][] matrixA = createMatrix(rows, cols, sc);
        int [][] matrixB = createMatrix(rows, cols, sc);

        int [][] result = addMatrix(matrixA, matrixB);
        printMatrix(result);

        sc.close();
    }
}
