package com.Releationship;

import java.util.Stack;

public class Main {

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int index = start;
        for (int i = start; i < end; i++) {
            if(arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;

        return index;
    }

    public static void sort(int arr[], int start, int end) {
        if (start < end) {
            int index = partition(arr, start, end);
            sort(arr, start, index-1);
            sort(arr, index+1, end);
        }
    }

    public static Stack<Integer> sort(Stack<Integer> s)
    {
        int[] arr = new int[s.size()];
        int k = 0;

        while(!s.isEmpty()) {
            arr[k++] = s.peek();
            s.pop();
        }

        sort(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }

        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Stack<Integer> stack2 = sort(stack);
        while (!stack2.isEmpty()) {
            System.out.println(stack2.peek());
            stack2.pop();
        }
    }
}
