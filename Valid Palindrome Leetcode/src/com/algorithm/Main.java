package com.algorithm;

import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }

        String value = sb.toString();

        if (value.length() == 0) {
            return true;
        }

        for (int i = 0; i <= value.length() / 2; i++) {
            if (value.charAt(i) != value.charAt(value.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isPalindrome(str));
        System.out.println(checkPalindrome(str));
    }

}
