package com.algorithm;

public class Main {

    public static void main(String[] args) {
        int[] arr = {7, 4, 12, 3, 6, 8, 1, 5, 10};
        BinaryTree tree = new BinaryTree();
        tree.constructFromLevelOrder(arr);
        tree.inorder();
    }
}
