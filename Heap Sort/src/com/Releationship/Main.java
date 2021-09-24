package com.Releationship;

class Solution {

    //Function to build a Heap from array.
    public void buildHeap(int arr[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    //Heapify function to maintain heap property.
    public void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, n, largest);
        }
    }

    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n) {
        buildHeap(arr, n);

        for (int i = n-1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        int arr[] = {4,1,3,9,7};
        int n = arr.length;

        Solution s = new Solution();
        s.heapSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
