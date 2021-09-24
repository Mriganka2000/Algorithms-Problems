package com.Releationship;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int item : arr) {
            if (hashSet.contains(item)) {
                System.out.println("First Duplicate is :- " + item);
                break;
            }
            else {
                hashSet.add(item);
            }
        }
    }
}
