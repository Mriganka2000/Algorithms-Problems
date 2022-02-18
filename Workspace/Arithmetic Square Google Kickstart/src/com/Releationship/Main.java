package com.Releationship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static int countArithmeticSquare(List<List<Integer>> list) {
        int count = 0;

        if ((list.get(0).get(0) + list.get(0).get(2)) / 2 == list.get(0).get(1)) {
            count++;
        }
        if ((list.get(0).get(0) + list.get(2).get(0)) / 2 == list.get(1).get(0)) {
            count++;
        }
        if ((list.get(2).get(0) + list.get(2).get(2)) / 2 == list.get(2).get(1)) {
            count++;
        }
        if ((list.get(0).get(2) + list.get(2).get(2)) / 2 == list.get(1).get(1)) {
            count++;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put((list.get(0).get(0) + list.get(2).get(2)) / 2, map.getOrDefault((list.get(0).get(0) + list.get(2).get(2)) / 2, 0) + 1);
        map.put((list.get(0).get(2) + list.get(2).get(0)) / 2, map.getOrDefault((list.get(0).get(2) + list.get(2).get(0)) / 2, 0) + 1);
        map.put((list.get(1).get(0) + list.get(1).get(1)) / 2, map.getOrDefault((list.get(1).get(0) + list.get(1).get(1)) / 2, 0) + 1);
        map.put((list.get(0).get(1) + list.get(2).get(1)) / 2, map.getOrDefault((list.get(0).get(1) + list.get(2).get(1)) / 2, 0) + 1);
        System.out.println(map);
        int max = 0;
        for (int item : map.keySet()) {
            if (map.get(item) > max) {
                max = map.get(item);
            }
        }

        return count + max;
    }

    public static void main(String[] args) {
	    List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(3);
        temp.add(4);
        temp.add(11);
        list.add(temp);
        List<Integer> temp2 = new ArrayList<>();
        temp2.add(10);
        temp2.add(9);
        list.add(temp2);
        List<Integer> temp3 = new ArrayList<>();
        temp3.add(-1);
        temp3.add(6);
        temp3.add(7);
        list.add(temp3);
        System.out.println(list);
        System.out.println(countArithmeticSquare(list));
    }
}
