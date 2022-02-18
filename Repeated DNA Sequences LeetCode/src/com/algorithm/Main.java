package com.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static List<String> findRepeatedDnaSequences(String str) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> list = new HashSet<>();

        for (int i = 0; i <= str.length() - 10; i++) {
            String sub = str.substring(i, i + 10);
            if (set.contains(sub)) {
                list.add(sub);
            }
            else {
                set.add(sub);
            }
        }

        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(str));
    }
}
