package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int countSubset(int arr[], int sum) {
        int[][] table = new int[arr.length + 1][sum + 1];

        for (int i = 0; i < table.length; i++) {
            table[i][0] = 1;
        }
        for (int i = 1; i < table[0].length; i++) {
            table[0][i] = 0;
        }

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < arr[i-1]) {
                    table[i][j] = table[i-1][j];
                }
                else {
                    table[i][j] = table[i-1][j] + table[i-1][j-arr[i-1]];
                }
            }
        }

        return table[table.length-1][table[0].length-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();
        System.out.println(countSubset(arr, sum));
    }
}
