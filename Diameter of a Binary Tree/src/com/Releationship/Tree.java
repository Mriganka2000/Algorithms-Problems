package com.Releationship;

import java.util.ArrayList;

class Height {
    int h;
}

public class Tree {
    public Node root;
    public static int maxLevel = 0;
    public ArrayList<Integer> arrayList = new ArrayList<>();

    public int diameter(Node root) {
        Height height = new Height();
        return solve(root, height);
    }

    public int solve(Node root, Height height) {
        Height lh = new Height(), rh = new Height();
        if(root == null) {
            height.h = 0;
            return 0;
        }

        int ldiameter = solve(root.left, lh);
        int rdiameter = solve(root.right, rh);

        height.h = Math.max(lh.h, rh.h) + 1;

        return Math.max(lh.h + rh.h + 1, Math.max(ldiameter, rdiameter));
    }

    public ArrayList<Integer> leftView(Node root) {
        int level = 1;
        leftView(root, level, arrayList);
        return arrayList;
    }

    public void leftView(Node root, int level, ArrayList arrayList) {
        if (root == null) {
            return;
        }

        if(maxLevel < level) {
            arrayList.add(root.data);
            maxLevel = level;
        }

        leftView(root.left, level+1, arrayList);
        leftView(root.right, level+1, arrayList);
    }
}
