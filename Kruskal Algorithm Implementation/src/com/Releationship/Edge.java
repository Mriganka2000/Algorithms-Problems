package com.Releationship;

public class Edge implements Comparable<Edge> {
    public int src;
    public int dest;
    public int weight;

    public Edge() {
    }

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge edge) {
        return this.weight - edge.weight;
    }
}
