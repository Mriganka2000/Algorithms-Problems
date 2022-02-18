package com.algorithm;

import java.util.Scanner;

public class Main {

    public static int lengthOfLastWord(String str) {
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            }
            else if (str.charAt(i) == ' ' && count > 0){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int res = lengthOfLastWord(str);
        System.out.println(res);
    }

}
