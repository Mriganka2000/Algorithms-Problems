package com.algorithm.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> partitionLabels(String str) {
        int[] position = new int[26];

        for (int i = 0; i < str.length(); i++) {
            position[str.charAt(i) - 'a'] = i;
        }

        List<Integer> list = new ArrayList<>();
        int j = 0, mark = 0;

        for (int i = 0; i < str.length(); i++) {
            j = Math.max(j, position[str.charAt(i) - 'a']);
            if (i == j) {
                list.add(i - mark + 1);
                mark = i + 1;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String str = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(str));
    }
}