package com.algorithm.java;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public Alphanumeric[] sortedStrings(int N, String str[]) {
        TreeMap<String, Integer> map = new TreeMap<>();

        for (String item : str) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        Alphanumeric[] result = new Alphanumeric[map.size()];
        int n = 0;
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            result[n++] = new Alphanumeric(item.getKey(), item.getValue());
        }

        return result;
    }

    public String driver(String[] str) {
        Alphanumeric[] result = sortedStrings(str.length, str);
        String res = "";

        for (Alphanumeric item : result) {
            res += item.name + " " + item.count;
        }

        return res;
    }
}