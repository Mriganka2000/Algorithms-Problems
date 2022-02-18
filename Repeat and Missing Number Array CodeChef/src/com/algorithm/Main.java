package com.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int[] arr = new int[A.size() + 1];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int item : A) {
            arr[item] += 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > 1) {
                ans.add(i);
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int[] arr = {3,1,2,5,4,6,7,5};
        for (int item : arr) {
            list.add(item);
        }
        System.out.println(repeatedNumber(list));
    }
}
