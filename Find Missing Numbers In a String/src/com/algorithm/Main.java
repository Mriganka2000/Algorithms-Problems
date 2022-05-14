package com.algorithm;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<String> findMissing(String st, String tr) {
        List<String> list = new ArrayList<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        String[] arr = st.replaceAll("[,.:-]", "").split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (!tr.contains(arr[i])) {
                set.add(arr[i]);
            }
        }

        for (String item : set) {
            list.add(item);
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        String tr = scanner.nextLine();
        System.out.println(findMissing(st, tr));
    }
}
