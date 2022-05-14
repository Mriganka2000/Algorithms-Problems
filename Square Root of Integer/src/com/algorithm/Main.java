package com.algorithm;

import java.util.Scanner;

public class Main {

    public static float sqrt(int n) {
        int start = 0, end = n;
        double result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == n) {
                return mid;
            }
            else if (mid * mid < n) {
                start = mid + 1;
                result = mid;
            }
            else {
                end = mid - 1;
            }
        }

        double decimal = 0.1;
        for (int i = 0; i < 3; i++) {
            while (result * result <= n) {
                result += decimal;
            }
            result = result - decimal;
            decimal = decimal / 10;
        }

        return (float) result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float result = sqrt(n);
        System.out.println(result);
    }
}
