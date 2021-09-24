package com.Releationship;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {-10,-3,0,5,9};
	    Solution s = new Solution();
	    TreeNode t = s.sortedArrayToBST(arr);
        System.out.println("The tree is :- ");
	    s.printTree(t);
    }
}
