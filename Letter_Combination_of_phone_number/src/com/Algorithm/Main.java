package com.Algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int change(char x) {
        if (x == '0') {
            return 0;
        }
        if (x == '1') {
            return 1;
        }
        if (x == '2') {
            return 2;
        }
        if (x == '3') {
            return 3;
        }
        if (x == '4') {
            return 4;
        }
        if (x == '5') {
            return 5;
        }
        if (x == '6') {
            return 6;
        }
        if (x == '7') {
            return 7;
        }
        if (x == '8') {
            return 8;
        }
        if (x == '9') {
            return 9;
        }
        else {
            return 0;
        }
    }

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList();

        if(digits.length() == 0) {
            return result;
        }

        result.add("");

        String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for(int i = 0; i < digits.length(); i++) {
            char x = digits.charAt(i);
            int index = change(x);
            while(result.peek().length() == i) {
                String permutation = result.remove();
                for(char c : map[index].toCharArray()) {
                    result.add(permutation + c);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String digit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the digit string :- ");
        digit = s.next();
	    List<String> l = letterCombinations(digit);
        System.out.println("The combinations are :- " + l);
    }
}
