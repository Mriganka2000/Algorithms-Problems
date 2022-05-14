package com.algorithm;

public class List {
    public Node head;

    public void swapNodes(int x, int y) {
        if (x == y) {
            return;
        }

        Node prevX = null, currentX = head;
        while (currentX != null && currentX.data != x) {
            prevX = currentX;
            currentX = currentX.next;
        }

        Node prevY = null, currentY = head;
        while (currentY != null && currentY.data != y) {
            prevY = currentY;
            currentY = currentY.next;
        }

        if (currentX == null || currentY == null) {
            return;
        }

        if (prevX != null) {
            prevX.next = currentY;
        }
        else {
            head = currentY;
        }

        if (prevY != null) {
            prevY.next = currentX;
        }
        else {
            head = currentX;
        }

        Node temp = currentX.next;
        currentX.next = currentY.next;
        currentY.next = temp;
    }

    public void push(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
