package com.algorithm.leetcode;

import java.util.Arrays;

public class Main {

    private static void printMatrixDiagonally(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int row  = i, col = 0; row >= 0 && col < matrix[0].length; row--, col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < matrix[0].length; i++) {
            for (int row = matrix.length - 1, col = i; row >= 0 && col < matrix[0].length; row--, col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 3, col = 3;
        int k = 1;
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = k++;
            }
        }

        System.out.println("Input Matrix");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("\nPrinting Matrix Diagonally");
        printMatrixDiagonally(matrix);
    }
}
