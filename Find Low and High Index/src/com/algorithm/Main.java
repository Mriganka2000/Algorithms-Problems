package com.algorithm;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static int findLowIndex(List<Integer> arr, int val) {
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int temp = arr.get(mid);
            if (temp < val) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (low < arr.size() && arr.get(low) == val) {
            return low;
        }

        return -1;
    }

    public static int findHighIndex(List<Integer> arr, int val) {
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int temp = arr.get(mid);
            if (temp <= val) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (high == -1) {
            return -1;
        }

        if (high < arr.size() && arr.get(high) == val) {
            return high;
        }

        return -1;
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6);
        int key = 5;
        System.out.println(findLowIndex(array, key));
        int high = findHighIndex(array, key);
        System.out.println(findHighIndex(array, key));
    }
}
