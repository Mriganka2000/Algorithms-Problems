package com.Releationship;

import java.util.*;

public class Main {

    public static ArrayList<Integer> sortByFreq(int arr[], int n) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        Arrays.sort(arr);
        for (int item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<Integer, Integer> linkedHashMap= new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> aa : list) {
            linkedHashMap.put(aa.getKey(), aa.getValue());
        }

        for (int item: linkedHashMap.keySet()) {
            for (int i = 0; i < linkedHashMap.get(item); i++) {
                arrayList.add(item);
            }
        }

        return arrayList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> arrayList = sortByFreq(arr, arr.length);

        System.out.println("After sort by frequency we get");
        for (int item : arrayList) {
            System.out.println(item);
        }
    }
}
