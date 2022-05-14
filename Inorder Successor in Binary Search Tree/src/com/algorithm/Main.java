package com.algorithm;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = null, temp = null, suc = null, min = null;
        root = tree.insert(root, 20);
        root = tree.insert(root, 8);
        root = tree.insert(root, 22);
        root = tree.insert(root, 4);
        root = tree.insert(root, 12);
        root = tree.insert(root, 10);
        root = tree.insert(root, 14);
        temp = root.left.right.right;
        suc = tree.inorderSuccessor(root, temp);
        if (suc != null) {
            System.out.println("Inorder successor of " + temp.data + " is " + suc.data);
        }
        else {
            System.out.println("Inorder successor does not exist");
        }
    }
}
