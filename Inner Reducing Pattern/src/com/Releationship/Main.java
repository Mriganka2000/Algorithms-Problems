package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        int size = 2 * n - 1;
        int start = 0, end = size-1;
        int[][] arr = new int[size][size];

        while(n != 0) {
            for (int i = start; i <= end; i++) {
                for (int j = start; j <= end; j++) {
                    if(i == start || i == end || j == start || j == end) {
                        arr[i][j] = n;
                    }
                }
            }
            start++;
            end--;
            n--;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
