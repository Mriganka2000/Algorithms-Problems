package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long num = scanner.nextInt();

            ArrayList<Long> list = new ArrayList<>();

            while (num != 0) {
                long rem = num % 10;
                list.add(rem);
                num = num / 10;
            }

            Collections.sort(list);

            long first = 0;
            long second = 0;

            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    first = first * 10 + list.get(i);
                }
                else {
                    second = second * 10 + list.get(i);
                }
            }

            System.out.println((first + second));
        }
    }
}
