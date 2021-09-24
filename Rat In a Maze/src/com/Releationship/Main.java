package com.Releationship;

public class Main {
    public static int n;

    public static void print(int solution[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void mazeHelp(int maze[][], int solution[][], int x, int y) {
        if (x == n-1 && y == n-1) {
            solution[x][y] = 1;
            print(solution);
        }

        if (x >= n || x < 0 || y >= n || y < 0 || maze[x][y] == 0 || solution[x][y] == 1) {
            return;
        }

        solution[x][y] = 1;
        mazeHelp(maze, solution, x+1, y);
        mazeHelp(maze, solution, x-1, y);
        mazeHelp(maze, solution, x, y+1);
        mazeHelp(maze, solution, x, y-1);
        solution[x][y] = 0;
    }

    public static void ratInAMaze(int maze[][]) {
        int[][] solution = new int[n][n];
        mazeHelp(maze, solution, 0, 0);
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0, 0 },
                        { 1, 1, 1, 1, 1 },
                        { 1, 1, 1, 0, 1 },
                        { 0, 0, 0, 0, 1 },
                        { 0, 0, 0, 0, 1 } };
        n = maze.length;
        ratInAMaze((maze));
    }
}
