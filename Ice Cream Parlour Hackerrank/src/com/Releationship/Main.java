package com.Releationship;

import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static List<Integer> solve(List<Integer> values, int m) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int[] arr = new int[values.size()];
        int n = 0;

        for (int item : values) {
            arr[n++] = item;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!hashMap.containsKey(m - arr[i])) {
                hashMap.put(arr[i], i);
            }
            else {
                list.add(hashMap.get(m-arr[i]) + 1);
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr.add(val);
        }
        System.out.print("Enter the max money :- ");
        int m = sc.nextInt();
        List<Integer> list = solve(arr, m);
        for (int item : list) {
            System.out.println(item);
        }
    }
}
