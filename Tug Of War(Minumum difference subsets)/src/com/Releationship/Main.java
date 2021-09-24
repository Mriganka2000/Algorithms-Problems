package com.Releationship;

import java.util.ArrayList;

public class Main {
    public static int minDifference = Integer.MAX_VALUE;
    public static String result = "";

    public static void solve(int arr[], int index, ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2, int sumSet1, int sumSet2) {
        if (index == arr.length) {
            if (Math.abs(sumSet1 - sumSet2) < minDifference) {
                minDifference = Math.abs(sumSet1 - sumSet2);
                result = arrayList1 + " " + arrayList2;
            }
            return;
        }
        if (arrayList1.size() < (arr.length + 1) / 2) {
            arrayList1.add(arr[index]);
            solve(arr, index + 1, arrayList1, arrayList2, sumSet1 + arr[index], sumSet2);
            arrayList1.remove(arrayList1.size() - 1);
        }
        if (arrayList2.size() < (arr.length + 1) / 2) {
            arrayList2.add(arr[index]);
            solve(arr, index + 1, arrayList1, arrayList2, sumSet1, sumSet2 + arr[index]);
            arrayList2.remove(arrayList2.size() - 1);
        }
    }

    public static void TugOfWar(int arr[]) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        solve(arr, 0, arrayList1, arrayList2, 0, 0);
    }

    public static void main(String[] args) {
        int arr[] = {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};
        TugOfWar(arr);
        System.out.println(result);
    }
}
