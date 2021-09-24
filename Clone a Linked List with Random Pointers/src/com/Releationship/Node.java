package com.Releationship;

public class Node {
    public int data;
    public Node next;
    public Node random;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }

    public Node(int data, Node next, Node random) {
        this.data = data;
        this.next = next;
        this.random = random;
    }
}
