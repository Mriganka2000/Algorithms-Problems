package com.algorithm;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(scanner.nextInt());
            }

            System.out.println(set.size());
        }
    }
}
