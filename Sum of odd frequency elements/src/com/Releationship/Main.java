package com.Releationship;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int arr[] = {1, 2, 4, 5, 6, 3, 1, 2, 3, 3};

        for (int i = 0; i < arr.length; i++) {
            if (hashmap.containsKey(arr[i])) {
                int val = hashmap.get(arr[i]);
                val += 1;
                hashmap.put(arr[i], val);
            }
            else {
                hashmap.put(arr[i], 1);
            }
        }

        int sum = 0;

        for(int item : hashmap.keySet()) {
            if (hashmap.get(item) % 2 != 0) {
                sum += item * hashmap.get(item);
            }
        }

        System.out.println("The sum is :- " + sum);
    }
}
