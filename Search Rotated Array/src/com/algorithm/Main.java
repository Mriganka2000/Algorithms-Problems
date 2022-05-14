package com.algorithm;

public class Main {

    public static int binarySearch(int[] arr, int start, int end, int val) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == val) {
                return mid;
            }
            else if (arr[start] <= arr[mid] && arr[mid] >= val && arr[start] <= val) {
                end = mid -1;
            }
            else if (arr[mid] <= arr[end] && arr[mid] <= val && arr[end] >= val) {
                start = mid + 1;
            }
            else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            else if (arr[end] <= arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchRotated(int[] arr, int val) {
        return binarySearch(arr, 0, arr.length - 1, val);
    }

    public static void main(String[] args) {
        int[] v1 = {6, 7, 1, 2, 3, 4, 5};
        System.out.println("Key(3) found at: " + binarySearchRotated(v1, 3));
        System.out.println("Key(6) found at: " + binarySearchRotated(v1, 6));

        int[] v2 = {4, 5, 6, 1, 2, 3};
        System.out.println("Key(3) found at: " + binarySearchRotated(v2, 3));
        System.out.println("Key(6) found at: " + binarySearchRotated(v2, 6));
    }
}
