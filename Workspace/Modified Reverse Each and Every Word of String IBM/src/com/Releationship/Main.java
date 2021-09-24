package com.Releationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String reverseWords(String str) {
        List<String> list = new ArrayList<>();
        str += "#";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '.' && str.charAt(i) != ',' && str.charAt(i) != '#') {
                word += str.charAt(i);
            }
            else {
                list.add(word);
                word = "";
            }
        }

        String result = "";
        for (String item : list) {
            char[] arr = item.toCharArray();
            for (int i = 1; i <= (arr.length - 1) / 2; i++) {
                char temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
            String val = "";
            for (int i = 0; i < arr.length; i++) {
                val += arr[i];
            }
            result += val;
            result += " ";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverseWords(str));
    }
}
