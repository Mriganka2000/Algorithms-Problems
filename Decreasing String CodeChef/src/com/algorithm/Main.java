package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int k = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            char ch = 'a';
            while (k-- != 0) {
                sb.append(ch);
                if (ch == 'z') {
                    sb.append('a');
                    ch = 'a';
                }
                ch++;
            }
            sb.append(ch);
            StringBuilder ans = sb.reverse();
            System.out.println(ans.toString());
        }
    }
}
