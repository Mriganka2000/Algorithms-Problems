package com.company;

import java.util.*;

public class Main {

    public static List<List<String>> printAnagrams(String[] strings) {
        HashMap<String, List<Integer>> hashMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char [] arr = strings[i].toCharArray();
            Arrays.sort(arr);
            String val = new String(arr);

            if (!hashMap.containsKey(val)) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                hashMap.put(val, list);
            }
            else {
                List<Integer> list = hashMap.get(val);
                list.add(i);
                hashMap.put(val, list);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (String item : hashMap.keySet()) {
            List<Integer> getList = hashMap.get(item);
            List<String> list = new ArrayList<>();

            for (int val : getList) {
                list.add(strings[val]);
            }
            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {
//	    Scanner scanner = new Scanner(System.in);
//	    int n = scanner.nextInt();
//	    String [] strings = new String[n];
//        for (int i = 0; i < n; i++) {
//            strings[i] = scanner.next();
//        }
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(printAnagrams(strings));
    }
}
