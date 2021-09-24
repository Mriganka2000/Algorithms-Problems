package com.Releationship;

import java.util. Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max_so_far = Integer.MIN_VALUE, max_here = 0;
        for (int i = 0; i < n; i++) {
            max_here += arr[i];
            if(max_here > max_so_far) {
                max_so_far = max_here;
            }
            if(max_here < 0) {
                max_here = 0;
            }
        }

        System.out.println("The max sum is :- " + max_so_far);
    }
}
