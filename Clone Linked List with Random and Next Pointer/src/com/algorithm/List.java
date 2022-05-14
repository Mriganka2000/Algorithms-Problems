package com.algorithm;

import java.util.HashMap;

public class List {
    
    public Node cloneList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();

        Node temp = head;

        while (temp != null) {
            Node newNode = new Node(temp.data);
            map.put(temp, newNode);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            Node node = map.get(temp);
            node.next = (temp.next != null) ? map.get(temp.next) : null;
            node.random = (temp.random != null) ? map.get(temp.random) : null;
            temp = temp.next;
        }

        return map.get(head);
    }

    public void printList(Node head) {
        while(head != null) {
            System.out.print(head.data+":");
            if(head.next != null)
                System.out.print(head.next.data);
            else
                System.out.print("NULL");
            if(head.random != null)
                System.out.print(","+head.random.data);
            else
                System.out.print(",NULL");
            System.out.println();
            head = head.next;
        }
    }

}
