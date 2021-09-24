package com.Releationship;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        String str = "aaaaaaaaaa";

        char[] stack = new char[str.length()];
        int n = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char character = str.charAt(i);

            if(n > 0 && stack[n-1] == character)
            {
                n--;
            }
            else {
                stack[n++] = character;
            }
        }

        String result = new String(stack, 0, n);
        System.out.println(result);
    }
}

