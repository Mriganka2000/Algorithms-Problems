package com.Releationship;

import java.util.*;

public class Main {

    public static boolean search(int arr[], int start, int end, int val) {
        if(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == val) {
                return true;
            }
            else if(arr[mid] > val) {
                return search(arr, 0, mid - 1, val);
            }
            else {
                return search(arr, mid + 1, end, val);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array :- ");
        int m = sc.nextInt();
        int [] a = new int[m];
        System.out.println("Enter the data of the first array :- ");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array :- ");
        int n = sc.nextInt();
        int [] b = new int[n];
        System.out.println("Enter the data of the second array :- ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.print("Enter the target value :- ");
        int v = sc.nextInt();

        Arrays.sort(a);

        boolean result = false;
        for(int i = 0; i < n; i++) {
            int val = v - b[i];
            result = search(a, 0, m-1, val);
            if(result) {
                break;
            }
        }

        if (result)  {
            System.out.println("Yes present");
        }
        else {
            System.out.println("Not present");
        }
    }
}