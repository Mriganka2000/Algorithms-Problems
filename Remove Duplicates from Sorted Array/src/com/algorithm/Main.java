package com.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void removeDuplicates(List<Integer> list) {
        int count = 0;
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(count).equals(list.get(i))) {
                count++;
                list.add(count, list.get(i));
            }
        }

        System.out.println(count+1);
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        removeDuplicates(list);
    }
}
