package com.Releationship;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void findPair(int arr[], int sum) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];
            if(hashSet.contains(temp)) {
                System.out.println("The pair is :- " + temp + " " + arr[i]);
            }
            hashSet.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array :- ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum :- ");
        int sum = sc.nextInt();
        findPair(arr, sum);
    }
}
