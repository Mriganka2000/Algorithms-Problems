package com.Releationship;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    public List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<>();
        pathSum(root, current, result, targetSum);
        return result;
    }

    private void pathSum(Node root, List<Integer> current, List<List<Integer>> result, int targetSum) {
        if (root == null) {
            return;
        }

        current.add(root.data);
        if (root.left == null && root.right == null && root.data == targetSum) {
            result.add(new ArrayList<>(current));
        }

        pathSum(root.left, current, result, targetSum - root.data);
        pathSum(root.right, current, result, targetSum - root.data);
        current.remove(current.size()-1);
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}
