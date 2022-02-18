package com.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, pre = null;
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j)
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(pre.get(j - 1) + pre.get(j));
            pre = row;
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(generate(n));
    }
}
