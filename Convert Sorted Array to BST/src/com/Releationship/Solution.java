package com.Releationship;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return solve(nums, 0, nums.length-1);
    }

    private TreeNode solve(int[] nums, int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode t = new TreeNode(nums[mid]);
        t.left = solve(nums, start, mid-1);
        t.right = solve(nums, mid+1, end);
        return t;
    }

    public void printTree(TreeNode root) {
        if(root != null) {
            System.out.println(root.val);
            printTree(root.left);
            printTree(root.right);
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
