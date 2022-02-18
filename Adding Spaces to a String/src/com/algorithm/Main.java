package com.algorithm;

public class Main {

    public static String addSpaces(String str, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int k = 0;

        for (int i = 0; i < str.length(); i++) {
            if (k < spaces.length && i == spaces[k]) {
                k++;
                sb.append(" ");
            }
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
	    String str = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        System.out.println(addSpaces(str, spaces));
    }
}
