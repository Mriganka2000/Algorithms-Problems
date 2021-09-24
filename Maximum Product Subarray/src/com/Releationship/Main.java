package com.Releationship;

public class Main {

    public static int maxProductSubset(int arr[]) {
        int count_zero = 0, count_minus = 0, product = 1, min_neg = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count_zero++;
                continue;
            }
            if(arr[i] < 0) {
                count_minus++;
                min_neg = Math.max(min_neg, arr[i]);
            }
            product *= arr[i];
        }

        if (count_zero == arr.length) {
            return 0;
        }

        if (count_minus % 2 != 0) {
            if (count_zero > 0 && count_minus + count_zero == arr.length && count_minus == 1) {
                return 0;
            }
            else {
                product = product / min_neg;
            }
        }
        return product;
    }

    public static void main(String[] args) {
        int[] arr = { -3, -3, -2, 4, 3 };
        System.out.println("The maximum product is :- " + maxProductSubset(arr));
    }
}
