package com.algorithm;

public class Main
{
    public static int lcs(char[] arr1, char[] arr2) {
        int[][] table = new int[arr1.length + 1][arr2.length + 1];

        for (int i = 0; i <= arr1.length; i++) {
            for (int j = 0; j <= arr2.length; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                }
                else if (arr1[i - 1] == arr2[j - 1]) {
                    table[i][j] = table[i - 1][j - 1] + 1;
                }
                else {
                    table[i][j] = Math.max(table[i][j - 1], table[i - 1][j]);
                }
            }
        }

        return table[arr1.length][arr2.length];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        System.out.println("Length of lcs is :- " + lcs(arr1, arr2));
    }
}
