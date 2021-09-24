package com.Releationship;

import java.util.Scanner;

public class Main {

    public static long reverse(long num) {
        long sum = 0;
        while (num != 0) {
            long rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        return sum;
    }

    public static boolean paindrome(long num) {
        long rev = reverse(num);
        if (rev == num) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long number = Long.parseLong(str);

        while (number <= 4294967295l) {
            number = number + reverse(number);
            if (paindrome(number)) {
                System.out.println(number);
                break;
            }
            else if (number > 4294967295l) {
                System.out.println("No palindrome");
            }
        }
    }
}
