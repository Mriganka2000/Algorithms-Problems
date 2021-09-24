package com.Releationship;

import java.util.Scanner;

public class Main {

    public static String reverse(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        return new String(arr);
    }

    public static String reverseString(String str) {
        String rev = reverse(str);
        rev += ".";
        String result = "";
        int start = 0, end = 0;
        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) != '.' && rev.charAt(i) != ' ') {
                continue;
            }
            else {
                String eval = rev.substring(start, i);
                result += reverse(eval);
                end = i - start;
                start += end+1;
            }
            result += ".";
        }
        return result.substring(0, result.length()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }
}
