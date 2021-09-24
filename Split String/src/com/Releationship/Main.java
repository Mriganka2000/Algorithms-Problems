package com.Releationship;

import java.util.ArrayList;

public class Main {

    public static String[] split(String string, char val) {
        ArrayList<String> arrayList = new ArrayList<>();
        String word = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == val) {
                arrayList.add(word);
                word = "";
            }
            else {
                word += string.charAt(i);
            }
        }
        arrayList.add(word);

        String result[] = new String[arrayList.size()];
        int n = 0;
        for (String item : arrayList) {
            result[n++] = item;
        }

        return result;
    }

    public static void main(String[] args) {
	    String string = "Welcome to world";
	    String result[] = split(string, ' ');

        for (int i = 0; i < result.length / 2; i++) {
            String temp = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = temp;
        }

        for (String item : result) {
            System.out.println(item);
        }
    }
}
