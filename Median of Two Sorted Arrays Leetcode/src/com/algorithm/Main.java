package com.algorithm;

public class Main {

    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        if (num1.length > num2.length) {
            return findMedianSortedArrays(num2, num1);
        }

        int a = num1.length;
        int b = num2.length;

        int start = 0;
        int end = a;

        while (start <= end) {
            int partitionA = (start + end) / 2;
            int partitionB = (a + b + 1) / 2 - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : num1[partitionA - 1];
            int minRightA = (partitionA == a) ? Integer.MAX_VALUE : num1[partitionA];

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : num2[partitionB - 1];
            int minRightB = (partitionB == b) ? Integer.MAX_VALUE : num2[partitionB];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if ((a + b) % 2 == 0) {
                    return ((double) Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2;
                }
                else {
                    return (double) Math.max(maxLeftA, maxLeftB);
                }
            }
            else if (maxLeftA > minRightB) {
                end = partitionA - 1;
            }
            else {
                start = partitionA + 1;
            }
        }

        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
	    int[] num1 = {1, 3, 8, 9, 15};
        int[] num2 = {7, 11, 19, 21, 18, 25};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
}
