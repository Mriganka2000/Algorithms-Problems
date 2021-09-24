package com.Releationship;

import java.util.Scanner;

public class Main
{
    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int index = low;

        for(int i = low; i < high; i++) {
            if(arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[high];
        arr[high] = temp;

        return index;
    }

    public void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int index = partition(arr, low, high);
            quickSort(arr, low, index-1);
            quickSort(arr, index+1, high);
        }
    }

    public int search(int arr[], int start, int end, int val) {
        if(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == val) {
                return mid;
            }
            else if(arr[mid] > val) {
                return search(arr, start, mid-1, val);
            }
            else {
                return search(arr, mid+1, end, val);
            }
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int temp[] = new int[n];

        for(int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        Main m = new Main();
        m.quickSort(temp, 0, n-1);

        System.out.println("The result is :- ");

        for(int item : arr) {
            System.out.println(item + " :- " + m.search(temp, 0, n-1, item));
        }
    }
}

