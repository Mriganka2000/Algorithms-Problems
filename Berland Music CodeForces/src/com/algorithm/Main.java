package com.algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            String str = scanner.next();

            HashMap<Integer, Integer> likes = new HashMap<>();
            HashMap<Integer, Integer> disLikes = new HashMap<>();

            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '0') {
                    disLikes.put(arr[i], i);
                }
                else {
                    likes.put(arr[i], i);
                }
            }

            int num = 1;
            for (int item : disLikes.keySet()) {
                arr[disLikes.get(item)] = num++;
            }
            for (int item : likes.keySet()) {
                arr[likes.get(item)] = num++;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }
}
