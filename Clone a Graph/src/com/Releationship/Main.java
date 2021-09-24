package com.Releationship;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        ArrayList<Node> arrayList = new ArrayList<Node>();
        arrayList.add(node2);
        arrayList.add(node4);
        node1.neighbors = arrayList;
        arrayList = new ArrayList<Node>();
        arrayList.add(node1);
        arrayList.add(node3);
        node2.neighbors = arrayList;
        arrayList = new ArrayList<Node>();
        arrayList.add(node2);
        arrayList.add(node4);
        node3.neighbors = arrayList;
        arrayList = new ArrayList<Node>();
        arrayList.add(node3);
        arrayList.add(node1);
        node4.neighbors = arrayList;

        Graph graph = new Graph();
        graph.printBFS(node1);
        System.out.println();
        Node result = graph.cloneGraph(node1);
        graph.printBFS(result);
    }
}
