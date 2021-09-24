package com.Releationship;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int getSum(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        int evenMax = 0;
        for (int i = 2; i < arr.length; i++) {
            if ((i+1) % 2 == 0) {
                evenMax = arr[i];
                break;
            }
        }
        int oddMax = 0;
        for (int i = 2; i < arr.length; i++) {
            if ((i+1) % 2 != 0) {
                oddMax = arr[i];
                break;
            }
        }

        return (evenMax + oddMax);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println(getSum(arr));
    }
}
