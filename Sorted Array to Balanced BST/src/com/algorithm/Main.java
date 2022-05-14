package com.algorithm;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.arrayToBst(arr, 0, arr.length - 1);
        tree.inorder(tree.root);
    }
}
