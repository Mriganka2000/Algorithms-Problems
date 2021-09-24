package com.Releationship;

import java.util.Scanner;

public class Main {

    public String toUpper(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if((int)arr[i] >= 97 && (int)arr[i] <= 126) {
                arr[i] = (char)(arr[i] - 32);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char item : arr) {
            sb.append(item);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String str = sc.nextLine();
        System.out.println(m.toUpper(str));
    }
}