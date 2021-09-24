package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void separateNumbers(String str) {
        String subString = "";
        boolean isValid = false;
        for (int i = 1; i <= str.length() / 2; i++) {
            subString = str.substring(0, i);
            long num = Long.parseLong(subString);
            String validString = subString;
            while(validString.length() < str.length()) {
                validString += Long.toString(++num);
            }
            if(str.equals(validString)) {
                isValid = true;
                break;
            }
        }
        System.out.println(isValid ? "YES " + subString : "NO");
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String str = scanner.next();
	    separateNumbers(str);
    }
}
