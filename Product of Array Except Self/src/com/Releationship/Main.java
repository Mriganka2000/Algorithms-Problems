package com.Releationship;

public class Main {

    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        if(nums.length < 1) {
            return output;
        }

        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            output[i] = product;
        }

        product = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            output[i] = output[i-1] * product;
            product *= nums[i];
        }
        output[0] = product;

        return output;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = productExceptSelf(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
