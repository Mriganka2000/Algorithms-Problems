package com.Releationship;

import java.util.Scanner;

public class Main {

//    Finds the Minimum distance vertex
    public static int findMinVertex(int distance[], boolean visited[]) {
        int minVertex = -1;

        for (int i = 0; i < distance.length; i++) {
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
                minVertex = i;
            }
        }

        return minVertex;
    }

    public static void dijkstraAlgorithm(int adjacentMatrix[][]) {
        boolean[] visited = new boolean[adjacentMatrix.length];
        int v = adjacentMatrix.length;
        int[] distance = new int[v];
        distance[0] = 0;

        for (int i = 1; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < v - 1; i++) {
//           Find the min distance vertex
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true; // Mark the visited vertex true
//            Explore all the min vertex neighbours
            for (int j = 0; j < v; j++) {
                if (adjacentMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
                    int newDistance = distance[minVertex] + adjacentMatrix[minVertex][j];
                    if (newDistance < distance[j]) {
                        distance[j] = newDistance;
                    }
                }
            }
        }

        for (int i = 0; i < v; i++) {
            System.out.println(i + " distance " + distance[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] adjacentMatrix = new int[v][v];

        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjacentMatrix[v1][v2] = weight;
            adjacentMatrix[v2][v1] = weight;
        }

        dijkstraAlgorithm(adjacentMatrix);
    }
}
