package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = 1;
        }

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if(arr[j] > arr[i] && list[j] < list[i] + 1) {
                    list[j] = list[i] + 1;
                }
            }
        }

        System.out.println("The max length is :- " + list[n-1]);
    }

}
