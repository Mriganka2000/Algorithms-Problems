package com.Releationship;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    private boolean checkSymmetric(TreeNode n1, TreeNode n2) {
        if(n1 == null && n2 == null) {
            return true;
        }
        if(n1 == null || n2 == null) {
            return false;
        }
        if(n1.val != n2.val) {
            return false;
        }
        return checkSymmetric(n1.left, n2.right) && checkSymmetric(n1.right, n2.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return false;
        }
        return checkSymmetric(root.left, root.right);
    }

    public void print(TreeNode root) {
        if(root != null) {
            print(root.left);
            System.out.println(root.val);
            print(root.right);
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Solution s = new Solution();
        if(s.isSymmetric(root)) {
            System.out.println("Symmetric");
        }
        else {
            System.out.println("Not Symmetric");
        }
    }
}