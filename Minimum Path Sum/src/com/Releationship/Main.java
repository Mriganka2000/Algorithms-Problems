package com.Releationship;

import java.util.Scanner;

public class Main {
    
    public static int findMinPath(int grid[][]) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] table = new int[m][n];
        table[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) {
            table[i][0] = table[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            table[0][j] = table[0][j-1] + grid[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                table[i][j] = grid[i][j] + Math.min(table[i][j-1], table[i-1][j]);
            }
        }

        return table[m-1][n-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row number :- ");
        int m = scanner.nextInt();
        System.out.print("Enter the column number :- ");
        int n = scanner.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The minimum path sum is :- " + findMinPath(grid));
    }
}
