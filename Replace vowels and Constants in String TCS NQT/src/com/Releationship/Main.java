package com.Releationship;

import java.util.Scanner;

public class Main {

    public static String replace(String str1, String str2, String str3) {
        StringBuilder result = new StringBuilder();
        char arr[] = str1.toCharArray();

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' || arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                arr[i] = '%';
            }
            result.append(arr[i]);
        }
        result.append(' ');

        arr = str2.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U' && arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u') {
                arr[i] = '#';
            }
            result.append(arr[i]);
        }
        result.append(' ');

        for (int i = 0; i < str3.length(); i++) {
            if (str3.charAt(i) - 'A' >= 32) {
                char val = (char)(str3.charAt(i) - 32);
                result.append(val);
            }
            else {
                result.append(str3.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st string :- ");
        String str1 = scanner.next();
        System.out.print("Enter the 2nd string :- ");
        String str2 = scanner.next();
        System.out.print("Enter the 3rd string :- ");
        String str3 = scanner.next();
        System.out.println("The strings after replacement :- " + replace(str1, str2, str3));
    }
}
