package com.Releationship;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> getValues(List<Integer> integerList, List<Integer> num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            if (!integerList.contains(num.get(i))) {
                list.add(num.get(i));
            }
        }
        return list;
    }

    public static List<List<Integer>> solve(int num[]) {
        List<List<Integer>> lists = new ArrayList<>();

        if (num.length > 1) {
            List<Integer> numList = new ArrayList<>();
            for (int i = 0; i < num.length; i++) {
                numList.add(num[i]);
            }
            dfs(numList, lists, new ArrayList<>(), 0);
        }
        else {
            List<Integer> integerList = new ArrayList<>();
            integerList.add(num[0]);
            lists.add(integerList);
        }

        return lists;
    }

    public static void add(List<List<Integer>> lists, List<Integer> integerList) {
        List<Integer> val = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            val.add(integerList.get(i));
        }
        lists.add(val);
    }

    public static void dfs(List<Integer> num, List<List<Integer>> lists, ArrayList<Integer> integerList, int index) {
        if (index == num.size()) {
            add(lists, integerList);
            return;
        }

        List<Integer> val = getValues(integerList, num);

        for (int i = 0; i < val.size(); i++) {
            int intVal = val.get(i);
            integerList.add(intVal);
            dfs(num, lists, integerList, index+1);
            integerList.remove(integerList.size()-1);
        }
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5 ,6};
        List<List<Integer>> result = solve(num);

        for (List<Integer> item : result) {
            System.out.println(item);
        }
    }
}
