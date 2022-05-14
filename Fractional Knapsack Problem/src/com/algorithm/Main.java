package com.algorithm;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    Double cost;
    int weight;
    double value;

    public Item(int weight, double value) {
        this.weight = weight;
        this.value = value;
        this.cost = value / weight;
    }
}

public class Main {

    private static double getMaxValue(int[] wt, int[] val, int capacity) {
        Item[] arr = new Item[val.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Item(wt[i], val[i]);
        }

        Arrays.sort(arr, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o2.cost.compareTo(o1.cost);
            }
        });

        int currentWeight = 0;
        double profit = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if (currentWeight + arr[i].weight <= capacity) {
                profit += arr[i].value;
                currentWeight += arr[i].weight;
            }
            else {
                int remain = capacity - currentWeight;
                profit += arr[i].cost * (double)remain;
                break;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] wt = { 10, 40, 20, 30 };
        int[] val = { 60, 40, 100, 120 };
        int capacity = 50;
        double maxValue = getMaxValue(wt, val, capacity);
        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}