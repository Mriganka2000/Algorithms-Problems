package com.Releationship;

import java.util.ArrayList;

public class Main {

    public static ArrayList<String> solve(String digits) {
        ArrayList<String> arrayList = new ArrayList<>();
        String map[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (digits != null && digits.length() != 0) {
            dfs(digits, arrayList, map, new StringBuilder(), 0);
        }
        return arrayList;
    }

    public static void dfs(String digits, ArrayList<String> arrayList, String map[], StringBuilder sb, int index) {
        if (index == digits.length()) {
            arrayList.add(sb.toString());
            return;
        }

        int val = Character.getNumericValue(digits.charAt(index));
        String word = map[val];

        for (int i = 0; i < word.length(); i++) {
            char eachChar = word.charAt(i);
            sb.append(eachChar);
            dfs(digits, arrayList, map, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
	    String digits = "234";
	    ArrayList<String> result = solve(digits);

        for (String item : result) {
            System.out.println(item);
        }
    }
}
