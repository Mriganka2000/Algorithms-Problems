package com.Releationship;

import java.util.HashMap;

public class LinkedList {
    public Node head;

    public Node clone(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node, Node> hashMap = new HashMap<>();
        Node temp = head;
        Node cloneList = null;
        while (temp != null) {
            Node cloneNode = new Node(temp.data);
            hashMap.put(temp, cloneNode);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            cloneList = hashMap.get(temp);
            cloneList.next = hashMap.get(temp).next;
            cloneList.random = hashMap.get((temp).random);
            temp = temp.next;
        }

        return cloneList;
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            Node random = temp.random;
            int randomData = (random != null)? random.data: -1;
            System.out.println("Data = " + temp.data + ", Random data = "+ randomData);
            temp = temp.next;
        }
    }
}
