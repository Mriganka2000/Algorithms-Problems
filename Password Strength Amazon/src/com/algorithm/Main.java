package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static int strengthOfPassword(String str) {
        int sum = 0, curr = 0, n = str.length();

        int[] last = new int[65];
        int[] prev = new int[65];

        Arrays.fill(last,-1);
        Arrays.fill(prev,-1);

        char[] chars = str.toCharArray();

        for(int i=0;i<n;i++) {
            char c = chars[i];
            curr += (i - last[c-65] - 1) - (last[c-65] - prev[c-65]) + 1;
            sum += curr;
            prev[c-65] = last[c-65];
            last[c-65] = i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int strength = strengthOfPassword(str);
        System.out.println(strength);
    }
}
