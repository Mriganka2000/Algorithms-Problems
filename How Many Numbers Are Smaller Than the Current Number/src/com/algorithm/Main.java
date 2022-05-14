package com.algorithm;

public class Main {

    public static int[] smallerNumbersThanCurrent(int[] num) {
        int[] arr = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] != num[j] && num[j] < num[i]) {
                    count++;
                }
            }
            arr[i] = count;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        int[] res =smallerNumbersThanCurrent(arr);

        for (int re : res) {
            System.out.println(re);
        }
    }
}
