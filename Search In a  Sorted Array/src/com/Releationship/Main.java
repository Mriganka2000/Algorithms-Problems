package com.Releationship;

public class Main {

    public static int search(int[] arr, int key) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left <= right) {
            int mid = (left+right) / 2;
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] >= arr[left]) {
                if(key <= arr[mid] && key >= arr[left]) {
                    right = mid-1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                if(key >= arr[mid] && key <= arr[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
	    int arr[] = {4,5,6,7,0,1,2};
	    int key = 0;
        System.out.println("The value present at  :- " + search(arr, key));
    }
}
