package com.algorithm;

import java.util.Scanner;

class Solution {
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    String[] ones = new String[]{"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        String word = "";

        if (num == 0) {
            return "Zero";
        }
        int i = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                word = helper(num % 1000) + THOUSANDS[i] + " " + word;
            }
            num /= 1000;
            i++;
        }

        return word.trim();
    }

    private String helper(int num) {
        if (num == 0) {
            return "";
        }
        else if (num < 20) {
            return LESS_THAN_20[num] + " ";
        }
        else if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        }
        else {
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
        }
    }

    public String numberToWords2(int num) {
        if(num == 0) {
            return "Zero";
        }

        StringBuilder sb = new StringBuilder();
        if(num >= 1000000000) {
            convert(num / 1000000000, sb);
            sb.append("Billion ");
            num = num % 1000000000;
        }

        if(num >= 1000000) {
            convert(num / 1000000, sb);
            sb.append("Million ");
            num = num % 1000000;
        }

        if(num >= 1000) {
            convert(num / 1000, sb);
            sb.append("Thousand ");
            num = num % 1000;
        }

        if(num > 0) {
            convert(num, sb);
        }

        return sb.toString().trim();
    }

    private void convert(int num, StringBuilder sb) {

        if(num > 99) {
            sb.append(ones[num / 100]).append(" Hundred ");
            num = num % 100;
        }

        if(num > 0) {
            if(num >= 20) {
                sb.append(tens[num / 10]).append(" ");
                num = num % 10;
            }

            if(num > 0)
                sb.append(ones[num]).append(" ");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.numberToWords(num));
        System.out.println(solution.numberToWords2(num));
    }
}
