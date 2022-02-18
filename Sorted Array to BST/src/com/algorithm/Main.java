package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Tree tree = new Tree();
        Node root = tree.convertToBST(arr, 0, arr.length - 1);
        tree.inOrder(root);
        System.out.println();
        tree.preOrder(root);
    }
}
