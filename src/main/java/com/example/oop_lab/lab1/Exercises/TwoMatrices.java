package com.example.oop_lab.lab1.Exercises;

import java.util.Scanner;

public class TwoMatrices {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };
        int[][] B = {
                {3, 4},
                {5, 6}
        };
        int rows = A.length;
        int cols = A[0].length;

        int [][] c = new int[rows][cols];

        for(int i = 0; i < rows; i ++) {
            for(int j = 0; j < cols; j ++) {
                c[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("The result of the matrix is : ");
        for(int i = 0; i < rows; i ++) {
            for(int j = 0; j < cols; j ++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
