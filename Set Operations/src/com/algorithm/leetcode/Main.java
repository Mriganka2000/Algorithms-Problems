package com.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

class Source {

    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>();

        for (int item : set1) {
            res.add(item);
        }

        for (int item : set2) {
            res.add(item);
        }

        return res;
    }

    public Set<Integer> subtract(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>();

        for (int item : set1) {
            if (!set2.contains(item)) {
                res.add(item);
            }
        }

        return res;
    }

    public Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>();

        for (int item : set1) {
            if (set2.contains(item)) {
                res.add(item);
            }
        }

        return res;
    }

}

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(6);
        set1.add(7);
        set1.add(8);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(9);
        set2.add(3);
        set2.add(7);

        Source source = new Source();
        System.out.println(source.union(set1, set2));
        System.out.println(source.subtract(set1, set2));
        System.out.println(source.intersect(set1, set2));
    }
}

