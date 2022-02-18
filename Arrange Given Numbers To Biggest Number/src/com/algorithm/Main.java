package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static String printBiggest(List<String> arr) {
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ab.compareTo(ba) > 0 ? -1 : 1;
            }
        });

        if (arr.get(0).equals("0")) {
            return "0";
        }

        String result = "";
        for (String item : arr) {
            result += item;
        }

        long val = Long.parseLong(result);

        return String.valueOf(val);
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
//        arr.add("0");
//        arr.add("0");
        System.out.println(printBiggest(arr));
    }
}
