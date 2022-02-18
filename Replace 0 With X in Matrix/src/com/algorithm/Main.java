package com.algorithm;

public class Main {

    public static void main(String[] args) {
        char[][] mat = {{'X', 'O', 'X', 'O', 'X', 'X'},
                        {'X', 'O', 'X', 'X', 'O', 'X'},
                        {'X', 'X', 'X', 'O', 'X', 'X'},
                        {'O', 'X', 'X', 'X', 'X', 'X'},
                        {'X', 'X', 'X', 'O', 'X', 'O'},
                        {'O', 'O', 'X', 'O', 'O', 'O'}};

        int M = mat.length;
        int N = mat[0].length;

        replaceSurrounded(mat, M, N);

        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(mat[i][j] + " ");

            System.out.println("");
        }
    }

    public static void replaceSurrounded(char[][] mat, int M, int N) {
        for (int i = 0;i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 'O') {
                    mat[i][j] = '-';
                }
            }
        }

        //Left
        for (int i = 0; i < M; i++) {
            if (mat[i][0] == '-') {
                floodFill(mat, '-', 'O', i, 0);
            }
        }
        //right
        for (int i = 0; i < M; i++) {
            if (mat[i][N - 1] == '-') {
                floodFill(mat, '-', 'O', i, N - 1);
            }
        }
        //top
        for (int i = 0; i < N; i++) {
            if (mat[0][i] == '-') {
                floodFill(mat, '-', 'O', 0, i);
            }
        }
        //Bottom
        for (int i = 0; i < N; i++) {
            if (mat[M - 1][i] == '-') {
                floodFill(mat, '-', 'O', M - 1, i);
            }
        }

        for (int i = 0;i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == '-') {
                    mat[i][j] = 'X';
                }
            }
        }
    }

    public static void floodFill(char[][] mat, char old_char, char new_char, int x, int y) {
        if (x < 0 || y < 0 || x >= mat.length || y >= mat[0].length) {
            return;
        }
        if (mat[x][y] != old_char) {
            return;
        }
        mat[x][y] = new_char;

        floodFill(mat, old_char, new_char, x + 1, y);
        floodFill(mat, old_char, new_char, x - 1, y);
        floodFill(mat, old_char, new_char, x, y + 1);
        floodFill(mat, old_char, new_char, x, y - 1);
    }
}
