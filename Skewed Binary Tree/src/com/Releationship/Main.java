package com.Releationship;

public class Main {

    public static void main(String[] args) {
        Node root = new Node(15);
        root.right = new Node(30);
        root.right.left = new Node(25);
        root.right.left.left = new Node(18);
        root.right.left.left.right = new Node(20);

        Solution s = new Solution();

        boolean isSkewed = s.check(root);

        if (isSkewed) {
            System.out.println("The tree is Skewed");
        }
        else {
            System.out.println("The tree is not Skewed");
        }
    }
}
