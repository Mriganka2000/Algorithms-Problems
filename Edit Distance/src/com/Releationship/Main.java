package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int minDistance(String word1, String word2) {
        int[][] table = new int[word1.length() + 1][word2.length() + 1];

        int m = word1.length();
        int n = word2.length();

        for(int i = 0; i <= m; i++) {
            table[i][0] = i;
        }
        for(int i = 0; i <= n; i++) {
            table[0][i] = i;
        }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1];
                }
                else {
                    table[i][j] = 1 + Math.min(table[i-1][j-1], Math.min(table[i][j-1], table[i-1][j]));
                }
            }
        }

        return table[m][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string :- ");
        String word1 = sc.next();
        System.out.print("Enter the second string :- ");
        String word2 = sc.next();
        System.out.println("The minimum distance need to edit :- " + minDistance(word1, word2));
    }
}
