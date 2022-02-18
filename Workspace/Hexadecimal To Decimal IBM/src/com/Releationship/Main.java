package com.Releationship;

import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int match = sc.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);
        int n = 0;
        int decimal = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            if (Character.isLetter(str.charAt(i))) {
                int val = map.get(str.charAt(i));
                decimal += val * Math.pow(16, n);
            }
            else {
                int val = Integer.parseInt(String.valueOf(str.charAt(i)));
                decimal += val * Math.pow(16, n);
            }
            n++;
        }
        if (decimal == match) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Unequal");
        }
    }
}

