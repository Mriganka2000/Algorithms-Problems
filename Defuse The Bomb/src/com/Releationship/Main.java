package com.Releationship;

import java.util.Scanner;

public class Main
{
    public static int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        if(k > 0) {
            for (int i = 0; i < code.length; i++) {
                int val = 0;
                for (int j = i + 1; j <= i+k; j++) {
                    val = val + code[j % code.length];
                }
                res[i] = val;
            }
        }
        if(k < 0) {
            k = k * (-1);
            for (int i = 0; i < code.length; i++) {
                int val = 0;
                for (int j = 1; j <= k; j++) {
                    val = val + code[(i + code.length - j) % code.length];
                }
                res[i] = val;
            }
        }
        if(k == 0) {
            for (int i = 0; i < code.length; i++) {
                res[i] = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array :- ");
        int n = sc.nextInt();
        int [] code = new int[n];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < n; i++) {
            code[i] = sc.nextInt();
        }
        System.out.print("Enter the number of value to take :- ");
        int k = sc.nextInt();
        int [] res = decrypt(code, k);
        System.out.println("Decrypt array is :- ");
        for(int i : res) {
            System.out.println(i);
        }
    }
}