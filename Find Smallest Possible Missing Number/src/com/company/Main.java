package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static int findMissing(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int index = 1;
        while (true) {
            if (!set.contains(index)) {
                return index;
            }
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array :- ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The missing number is :- " + findMissing(arr));
    }
}
