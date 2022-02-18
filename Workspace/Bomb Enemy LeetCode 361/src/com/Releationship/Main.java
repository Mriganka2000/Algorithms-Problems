package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int columnCount(char[][] grid, int i, int j) {
        int count = 0;

        while (i < grid.length && grid[i][j] != 'W') {
            if (grid[i][j] == 'E') {
                count++;
            }
            i++;
        }

        return count;
    }

    public static int rowCount(char[][] grid, int i, int j) {
        int count = 0;

        while (j < grid[0].length && grid[i][j] != 'W') {
            if (grid[i][j] == 'E') {
                count++;
            }
            j++;
        }

        return count;
    }

    public static int maxKilledEnemies(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int row = 0;
        int[] col = new int[n];
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'W') {
                    continue;
                }
                if (i == 0 || grid[i - 1][j] == 'W') {
                    col[j] = columnCount(grid, i, j);
                }
                if (j == 0 || grid[i][j - 1] == 'W') {
                    row = rowCount(grid, i, j);
                }
                if (grid[i][j] == '0') {
                    max = Math.max(max, col[j] + row);
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int m = scanner.nextInt();
	    int n = scanner.nextInt();
	    char[][] arr = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.next().charAt(0);
            }
        }
        System.out.println(maxKilledEnemies(arr));
    }
}
