package com.Releationship;

import java.util.*;

public class Main {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int item : brr) {
            if (hashMap.containsKey(item)) {
                hashMap.put(item, hashMap.get(item) + 1);
            }
            else {
                hashMap.put(item, 1);
            }
        }

        for (int item : arr) {
            if (hashMap.containsKey(item)) {
                hashMap.put(item, hashMap.get(item) - 1);
            }
        }

        for (int item : hashMap.keySet()) {
            if (hashMap.get(item) != 0) {
                result.add(item);
            }
        }

        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();
        System.out.println("Enter the size of the 1st array :- ");
        int m = sc.nextInt();
        System.out.println("Enter the size of the 2nd array :- ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the 1st array :- ");
        for (int i = 0; i < m; i++) {
            int val = sc.nextInt();
            arr.add(val);
        }

        System.out.println("Enter the elements of the 2nd array :- ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            brr.add(val);
        }

        List<Integer> result = missingNumbers(arr, brr);

        System.out.println();
        for (int item : result) {
            System.out.println(item);
        }
    }
}
