package com.Releationship;

public class Main {

    public static void main(String[] args) {
        String postfix = "ab+cde+**";
        Solution s = new Solution();

        Node root = s.construct(postfix);

        System.out.println("Postfix Structure :- ");
        s.postOrder(root);
        System.out.println();
        System.out.println("Original expression :- ");
        s.inOrder(root);
        System.out.println();
    }
}
