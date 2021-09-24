package com.Releationship;

import java.util.*;

public class Main {

    public static void permutation(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
            return;
        }

        for (int i = l; i <= r; i++) {
            str = interchange(str, l, i);
            permutation(str, l+1, r);
            str = interchange(str, l, i);
        }
    }

    public static String interchange(String str, int a, int b) {
        char arr[] = str.toCharArray();
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        permutation("abcd", 0, 3);
    }
}
