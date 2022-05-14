package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void mergeTrees(TreeNode root1, TreeNode root2) {
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2 = new ArrayList<>();

        BinaryTree tree = new BinaryTree();
        tree.inorder(root1, tree1);
        tree.inorder(root2, tree2);

        LinkedList list = new LinkedList();
        int i = 0, j = 0;
        while (i < tree1.size() && j < tree2.size()) {
            if (tree1.get(i) < tree2.get(j)) {
                list.insert(tree1.get(i));
                i++;
            }
            else {
                list.insert(tree2.get(j));
                j++;
            }
        }

        while (i < tree1.size()) {
            list.insert(tree1.get(i));
            i++;
        }
        while (j < tree2.size()) {
            list.insert(tree2.get(j));
            j++;
        }

        list.print();
    }
}
