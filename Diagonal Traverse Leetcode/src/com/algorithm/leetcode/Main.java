package com.algorithm.leetcode;

import java.util.Arrays;

public class Main {

    private static int[] printMatrixDiagonally(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] res = new int[m * n];
        int i = 0, row = 0, col = 0;
        boolean isUp = true;

        while (row < m && col < n) {
            if (isUp) {
                while (row > 0 && col < n - 1) {
                    res[i++] = matrix[row][col];
                    row--;
                    col++;
                }
                res[i++] = matrix[row][col];
                if (col == n - 1){
                    row++;
                }
                else {
                    col++;
                }
            }
            else {
                while (col > 0 && row < m - 1) {
                    res[i++] = matrix[row][col];
                    row++;
                    col--;
                }
                res[i++] = matrix[row][col];
                if (row == m - 1) {
                    col++;
                }
                else {
                    row++;
                }
            }
            isUp = !isUp;
        }

        return res;
    }

    public static void main(String[] args) {
        int row = 4, col = 3;
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
        int[] res = printMatrixDiagonally(matrix);

        for (int item : res) {
            System.out.println(item);
        }
    }
}
