package com.algorithm.java;

public class Main {

    public static int maximumPath(int n, int[][] matrix) {
        int result = -1;

        for (int i = 0; i < matrix[0].length; i++) {
            result = Math.max(result, matrix[0][i]);
        }

        for (int i = 1; i < n; i++) {
            result = -1;
            for (int j = 0; j < n; j++) {
                if (j > 0 && j < n - 1) {
                    matrix[i][j] += Math.max(matrix[i - 1][j], Math.max(matrix[i - 1][j - 1], matrix[i - 1][j + 1]));
                }
                else if (j > 0) {
                    matrix[i][j] += Math.max(matrix[i - 1][j], matrix[i - 1][j - 1]);
                }
                else if (j < n - 1) {
                    matrix[i][j] += Math.max(matrix[i - 1][j], matrix[i - 1][j + 1]);
                }

                result = Math.max(result, matrix[i][j]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 2;
        int[][] matrix = {{348, 391},
                {618, 193}};
        System.out.println(maximumPath(n, matrix));
    }
}