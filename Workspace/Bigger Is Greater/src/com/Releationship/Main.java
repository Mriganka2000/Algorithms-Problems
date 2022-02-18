package com.Releationship;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String biggerIsGreater(String str) {
        char[] arr = str.toCharArray();
        int end = 0;

        for (end = arr.length - 1; end > 0; end--) {
            if (arr[end] > arr[end - 1]) {
                break;
            }
        }

        if (end == 0) {
            return "no answer";
        }
        else {
            char small = arr[end - 1];
            int nextSmall = end;
            for (int i = end + 1; i < arr.length; i++) {
                if (arr[i] > small && arr[i] < arr[nextSmall]) {
                    nextSmall = i;
                }
            }
            swap(arr, end - 1, nextSmall);
            Arrays.sort(arr, end, arr.length);
        }

        return new String(arr);
    }

    public static void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(biggerIsGreater(str));
    }
}
