package com.algorithm;

import java.util.Scanner;

class Item {
    public int weight;
    public int cost;

    public Item(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }
}

public class Main {

    public static void knapSack(Item[] arr) {
        int maxWeight = 0;

        for (Item item : arr) {
            maxWeight += item.weight;
        }

        int[][] table = new int[arr.length + 1][maxWeight + 1];

        for (int i = 0; i <= arr.length; i++) {
            for (int w = 0; w <= maxWeight; w++) {
                if (i == 0 || w == 0) {
                    table[i][w] = 0;
                }
                else if (arr[i - 1].weight <= w) {
                    table[i][w] = Math.max(arr[i - 1].cost + table[i - 1][w - arr[i - 1].weight], table[i - 1][w]);
                }
                else {
                    table[i][w] = table[i - 1][w];
                }
            }
        }

        for (int i = 1; i <= maxWeight; i++) {
            System.out.print(table[arr.length][i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Item[] arr = new Item[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Item(scanner.nextInt(), scanner.nextInt());
        }

        knapSack(arr);
    }
}
