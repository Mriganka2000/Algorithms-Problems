package com.Releationship;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public void inorder(TreeNode root) {
        if(root != null) {
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        LinkedList<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()) {
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                TreeNode t = q.poll();
                list.add(t.val);
                if(t.left != null) {
                    q.add(t.left);
                }
                if(t.right != null) {
                    q.add(t.right);
                }
            }
            result.addFirst(list);
        }
        return result;
    }
}

public class Main
{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution s = new Solution();
        List<List<Integer>> list = s.levelOrderBottom(root);
        System.out.println("The inorder traversal is :- ");
        s.inorder(root);
        System.out.println("The level order traversal order is :- ");
        for (List<Integer> item : list) {
            for (Integer i : item) {
                System.out.println(i);
            }
        }
    }
}
