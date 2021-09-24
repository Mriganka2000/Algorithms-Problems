package com.Releationship;

public class Main {

    public static int findCeil(int arr[], int start, int end, int val) {
        if(val <= arr[start]) {
            return arr[start];
        }

        if(val > arr[end]) {
            return -1;
        }

        int mid = (start + end) / 2;

        if(arr[mid] == val) {
            return arr[mid];
        }

        else if(arr[mid] < val) {
            return findCeil(arr, mid+1, end, val);
        }

        else {
            return findCeil(arr, start, mid, val);
        }
    }

    public static int findFloor(int arr[], int start, int end, int val) {
        if(val < arr[start]) {
            return -1;
        }

        if(val >= arr[end]) {
            return arr[end];
        }

        int mid = (start + end) / 2;

        if(mid == start) {
            return arr[start];
        }

        if(arr[mid] == val) {
            return arr[mid];
        }

        else if(arr[mid] < val) {
            return findFloor(arr, mid, end, val);
        }

        else {
            return findFloor(arr, start, mid-1, val);
        }
    }

    public static void main(String[] args) {
        int[] A = { 1, 4, 6, 8, 9 };

        for (int i = 0; i <= 10; i++)
        {
            System.out.print("Number " + i + " —> ");
            System.out.print("ceiling is " + findCeil(A, 0, A.length - 1, i) + ", ");
            System.out.println("floor is " + findFloor(A, 0, A.length - 1, i));
        }
    }
}
