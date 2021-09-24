package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the string :- ");
        String str = s.nextLine();

        int j = 0, count = 0;

        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if (((int)val >= 65 && (int)val <= 90) || ((int)val >= 97 && (int)val <= 122)) {
                count++;
            }
        }

        char arr[] = new char[count];

        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if (((int)val >= 65 && (int)val <= 90) || ((int)val >= 97 && (int)val <= 122)) {
                if ((int)val >= 65 && (int)val <= 90) {
                    int intValue = (int)val + 32;
                    arr[j] = (char)intValue;
                    j++;
                }
                else {
                    arr[j] = val;
                    j++;
                }
            }
        }

        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                System.out.println("False");
                break;
            }
        }
        if (i == arr.length) {
            System.out.println("True");
        }
    }
}
