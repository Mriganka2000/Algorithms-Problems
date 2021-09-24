package com.Releationship;

public class Solution {
    private int getSize(Node node) {
        if(node == null) {
            return 0;
        }

        return 1 + getSize(node.left) + getSize(node.right);
    }

    private int getHeight(Node node) {
        if(node == null) {
            return 0;
        }

        return 1 + Integer.max(getHeight(node.left), getHeight(node.right));
    }

    public boolean check(Node node) {
        return getSize(node) == getHeight(node);
    }
}
