package com.Releationship;

import java.util.Scanner;

public class Main {

    public static int maxRobbery(int arr[]) {
        if (arr.length == 1) {
            return arr[0];
        }

        int[] table = new int[arr.length];
        table[0] = arr[0];

        if (table[0] < arr[1]) {
            table[1] = arr[1];
        }
        else {
            table[1] = table[0];
        }

        for (int i = 2; i < arr.length; i++) {
            table[i] = Math.max(table[i-1], table[i-2]+arr[i]);
        }

        return table[arr.length - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of houses :- ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The max money :- " + maxRobbery(arr));
    }
}
