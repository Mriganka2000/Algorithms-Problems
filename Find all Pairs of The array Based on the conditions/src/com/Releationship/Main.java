//Given an array, divide it into two parts such that:
//        a. The union of both the parts gives the original array.
//
//        b. The intersection of both the parts is null.
//
//        c. Sum of first part is greater than the second part.
//
//        d. Size of the first part is smaller than the second.
//
//        e. Find all such pairs from the given array.

package com.Releationship;

import java.util.*;

public class Main
{
    public static void findPairs(int arr[]) {
        int originalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            originalSum += arr[i];
        }

        int sum = 0, start = 0;
        List<Integer> list = new ArrayList<>();

        while(arr.length - list.size() > list.size() && start < arr.length) {
            sum += arr[start];
            list.add(arr[start]);
            start++;
            if(originalSum - sum < sum) {
                System.out.println();
                for(int item : list) {
                    System.out.println(item);
                }

                System.out.println();
                for (int i = start; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = temp;
        }

        System.out.print("Possible pairs are :- ");
        findPairs(arr);
    }
}
