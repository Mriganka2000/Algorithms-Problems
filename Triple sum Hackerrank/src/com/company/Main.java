package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static long triplets(int[] a, int[] b, int[] c) {
        int[] newA = removeDuplicates(a);
        int[] newB = removeDuplicates(b);
        int[] newC = removeDuplicates(c);

        long count = 0;
        Arrays.sort(newA);
        Arrays.sort(newB);
        Arrays.sort(newC);

        for (int item : newB) {
            long count1 = getValidIndex(newA, item) + 1;
            long count2 = getValidIndex(newC, item) + 1;
            count += count1 * count2;
        }

        return count;
    }

    public static long getValidIndex(int[] arr, int val) {
        int start = 0;
        int end = arr.length - 1;
        int count = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= val) {
                count = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return count;
    }

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }

        int[] result = new int[hashSet.size()];
        int n = 0;
        for (int item : hashSet) {
            result[n++] = item;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        int[] a = new int[p];
        int[] b = new int[q];
        int[] c = new int[r];

        for (int i = 0; i < p; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < q; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < r; i++) {
            c[i] = scanner.nextInt();
        }

        System.out.println(triplets(a, b, c));
    }
}
