package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String[] arr = {"abc", "def", "ghi"};
        ArrayList<String> arrayList = new ArrayList<>();
        int n = 0;

        for(String item : arr) {
            char[] temp = item.toCharArray();
            StringBuilder sb = new StringBuilder();
            sb.append('$');
            for (int i = 1; i < temp.length; i++) {
                sb.append(temp[i]);
            }
            sb.append('_');
            arrayList.add(sb.toString());
        }

        System.out.println(arrayList);
    }
}
