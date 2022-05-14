package com.algorithm;

import java.util.ArrayList;

public class BinaryTree {

    public ArrayList<Integer> inorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        bstToArray(root, list);
        return list;
    }

    private void bstToArray(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        bstToArray(root.left, list);
        list.add(root.data);
        bstToArray(root.right, list);
    }

    private static int index = 0;

    public void convertToMinHeap(Node root) {
        index = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        bstToArray(root, arr);

        arrayToMinHeap(root, arr);
    }

    public void arrayToMinHeap(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        root.data = list.get(index++);
        arrayToMinHeap(root.left, list);
        arrayToMinHeap(root.right, list);
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
