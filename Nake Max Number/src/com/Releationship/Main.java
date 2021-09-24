package com.Releationship;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[10];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) && arr[Integer.parseInt(Character.toString(str.charAt(i)))] == 0) {
                arr[Integer.parseInt(Character.toString(str.charAt(i)))] = 1;
                count++;
            }
            else if (Character.isDigit(str.charAt(i)) && arr[Integer.parseInt(Character.toString(str.charAt(i)))] == 1) {
                continue;
            }
        }

        int[] result = new int[count];
        int n = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                result[n] = i;
                n++;
            }
        }

        boolean even = false;
        for (int item : result) {
            if (item % 2  == 0) {
                even = true;
                break;
            }
        }

        if (even) {
            if(result[result.length-1] % 2 != 0) {
                for (int i = result.length-2; i >= 0; i--) {
                    if(result[i] % 2 == 0) {
                        int temp = result[i];
                        result[i] = result[result.length-1];
                        result[result.length-1] = temp;
                        break;
                    }
                }
            }

            long value = 0;
            for (int item : result) {
                value = value * 10 + item;
            }

            System.out.println(value);
        }
        else {
            System.out.println(-1);
        }
    }
}