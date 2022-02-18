package com.Releationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void minimumBribes(List<Integer> list) {
        int[] arr = new int[list.size()];
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != i + 1) {
                if (arr[i - 1] == i + 1) {
                    count++;
                    swap(arr, i, i - 1);
                }
                else if (arr[i - 2] == i + 1) {
                    count = count + 2;
                    swap(arr, i - 2, i - 1);
                    swap(arr, i - 1, i);
                }
                else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        minimumBribes(list);
    }
}
