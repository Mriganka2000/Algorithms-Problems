package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static int evenNumber(String str) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                arrayList.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            }
        }

        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0 && arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }

        int result = 0;
        for (Integer item : arrayList) {
            if (item == min) {
                continue;
            } else {
                result = result * 10 + item;
            }
        }

        result = result * 10 + min;

        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else {
            System.out.println(result);
        }

        return 0;
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        evenNumber(str);
    }
}
