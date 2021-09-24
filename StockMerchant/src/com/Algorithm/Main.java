package com.Algorithm;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static int sockMerchant(int n, int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i < n; i++) {
            int element = arr[i];
            if(set.contains(element)) {
                set.remove(element);
                count++;
            }
            else {
                set.add(element);
            }
        }
        return count;
    }
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
	    int n = s.nextInt();
	    int[] arr = new int[n];
        System.out.println("Enter the array elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("The result is :- " + sockMerchant(n, arr));
    }
}
