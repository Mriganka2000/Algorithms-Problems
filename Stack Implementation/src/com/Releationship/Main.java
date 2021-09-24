package com.Releationship;

public class Main {

    public static void main(String args[]) {

        Stack stack = new Stack(10);
        stack.push(15);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        calculateSum(stack);

        System.out.println("Updated stack");
        stack.display();
    }

    public static void calculateSum(Stack stack) {
        int[] arr = new int[stack.getMaxSize()+1];
        int sum = 0, n = 0;
        while(!stack.isEmpty()) {
            int val = stack.pop();
            arr[n++] = val;
            sum += val;
        }
        arr[n++] = sum;
        for (int i = n-1; i >= 0; i--) {
            stack.push(arr[i]);
        }
    }
}
