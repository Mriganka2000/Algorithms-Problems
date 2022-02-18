package com.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < m; i++) {
                set.add(sc.nextInt());
            }

            ArrayList<Integer> chef = new ArrayList<>();
            ArrayList<Integer> assistant = new ArrayList<>();
            boolean flag = true;

            for (int i = 1; i <= n; i++) {
                if (set.contains(i)) {
                    continue;
                }
                else if (flag) {
                    chef.add(i);
                    flag = false;
                }
                else {
                    assistant.add(i);
                    flag = true;
                }
            }

            for (int item : chef) {
                System.out.print(item + " ");
            }
            System.out.println();
            for (int item : assistant) {
                System.out.print(item + " ");
            }
        }
    }
}
