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
            int check = (int)Math.sqrt(n);

            for (int i = 1; i <= check; i++) {
                if (n % i == 0) {
                    int diff = i - (n / i);
                    if (diff < 0) {
                        diff = diff * -1;
                    }
                    set.add(diff);
                }
            }

            int min = Integer.MAX_VALUE;
            for (int item : set) {
                if (item < min) {
                    min = item;
                }
            }

            System.out.println(min);
        }
    }
}
