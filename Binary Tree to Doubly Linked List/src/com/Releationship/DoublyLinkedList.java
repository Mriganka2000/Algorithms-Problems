package com.Releationship;

public class DoublyLinkedList {

    public Node head = null;

    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
        }
        else {
            Node temp = head;
            while (temp.right != null) {
                temp = temp.right;
            }
            Node newNode = new Node(data);
            temp.right = newNode;
            newNode.left = temp;
        }
    }

    public void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.right;
        }
    }
}
