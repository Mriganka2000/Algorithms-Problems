package com.Releationship;

import java.util.*;

public class Main {

    public static int solve(ArrayList<Integer> A) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (Integer item : A) {
            map.put(item, 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j <list.size() ; j++) {
                if (list.get(i) > list.get(j)) {
                    count++;
                }
            }
        }
        return count * count;
    }

    public static int solve(int a, int b) {
        int count = 0;
        while (a + b != 0) {
            long product = (long) a * b;
            int val = (int) Math.floor(Math.sqrt(product));
            if (val != 0) {
                int divA = (int) a / val;
                int divB = (int) b / val;
                if (divA != 1 || divB != 1) {
                    if (divA != 1) {
                        a = a / val;
                        count += 2;
                    }
                    if (divB != 1) {
                        b = b / val;
                        count += 2;
                    }
                }
                else {
                    if (a != 0) {
                        a = a / 2;
                        count += 1;
                    }
                    if (b != 0) {
                        b = b / 2;
                        count += 1;
                    }
                }
            }
            else {
                if (a != 0) {
                    a = a / 2;
                    count += 1;
                }
                if (b != 0) {
                    b = b / 2;
                    count += 1;
                }
            }
        }
        return count;
    }

    public static int solve(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        final long temp = 1000000007;
        long sum = 0;
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                sum += Math.max(arr1.get(i) + arr2.get(j), arr1.get(j) + arr2.get(i));
            }
        }
        int result = (int) (sum % temp);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(3);
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(4);
        arr3.add(0);
        arr3.add(6);
        arr3.add(0);
        arr3.add(1);
        arr3.add(9);
        arr3.add(8);
        arr3.add(0);
        arr3.add(4);
        int val = solve(arr3);
        System.out.println(val);
    }
}
