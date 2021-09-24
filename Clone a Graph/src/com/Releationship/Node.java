package com.Releationship;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int data;
    public List<Node> neighbors;

    public Node() {
        data = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int data) {
        this.data = data;
        neighbors = new ArrayList<Node>();
    }

    public Node(int data, ArrayList<Node> neighbors) {
        this.data = data;
        this.neighbors = neighbors;
    }
}
