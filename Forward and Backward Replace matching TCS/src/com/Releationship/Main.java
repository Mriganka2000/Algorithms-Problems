package com.Releationship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :- ");
        String str = scanner.next();

        String forward = str.charAt(str.length()-1) + str.substring(0, str.length()-1);
        String backward = str.substring(1) + str.charAt(0);

        if (forward.equals(backward)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
