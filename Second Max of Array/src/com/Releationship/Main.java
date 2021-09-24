package com.Releationship;

public class Main {

    public static void main(String[] args) {
        int arr[] = {23, 45, 7, 34, 25, 25, 89};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int sec_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sec_max && arr[i] < max) {
                sec_max = arr[i];
            }
        }

        System.out.println(sec_max);
    }
}
