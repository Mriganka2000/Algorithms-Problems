package com.algorithm;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static int majorityElement(final List<Integer> arr) {
        int element = arr.get(0), maxCount = 1;

        for (int i = 1; i < arr.size(); i++) {
            if (element == arr.get(i)) {
                maxCount++;
            }
            else {
                maxCount--;
                if (maxCount == 0) {
                    element = arr.get(i);
                    maxCount = 1;

                }
            }
        }

        return element;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 1, 2);
        System.out.println(majorityElement(arr));
    }
}
