package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number of square matrix :- ");
        int n = sc.nextInt();
        int [][] arr = new int[n][n];

        System.out.println("Enter the data of the matrix :- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix given :- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < (n/2); i++) {
            for (int j = 0; j < n; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[j][n-i-1];
                arr[j][n-i-1] = temp;
            }
        }

        System.out.println("After 90 degree rotation :- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
