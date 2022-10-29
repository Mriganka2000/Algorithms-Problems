package com.algorithm.java;

public class Main {

    public static void calculate(int n) {
        int[][] matrix = new int[n][n];

        int i = n / 2, j = n - 1;

        for (int num = 1; num <= n * n;) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n) {
                    j = 0;
                }
                if (i < 0) {
                    i = n - 1;
                }
            }
            if (matrix[i][j] != 0) {
                j = j - 2;
                i++;
                continue;
            } else {
                matrix[i][j] = num;
                num++;
            }
            j++;
            i--;
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        calculate(3);
    }
}