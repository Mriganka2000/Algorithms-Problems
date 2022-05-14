package com.algorithm;

public class Main {

    public static int findInstances(int instances, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 25 && instances > 1) {
                instances = (int) Math.ceil(instances / 2.0);
                i += 10;
            }
            else if (arr[i] > 60 && instances < 200000000) {
                instances = instances * 2;
                i += 10;
            }
        }
        return instances;
    }

    public static void main(String[] args) {
        int instances = 2;
        int[] arr = {25, 23, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 76, 80};
        System.out.println(findInstances(instances, arr));
    }
}
