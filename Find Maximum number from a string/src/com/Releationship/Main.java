package com.Releationship;

import java.util.*;

public class Main {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String str = "Hello#81@21349";
        HashSet<Character> hashSet1 = new HashSet<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                if(hashSet1.contains(str.charAt(i))) {
                    continue;
                }
                else {
                    hashSet1.add(str.charAt(i));
                    count++;
                }
            }
        }

        HashSet<Character> hashSet2 = new HashSet<>();
        int[] arr = new int[count];
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                if (hashSet2.contains(str.charAt(i))) {
                    continue;
                }
                else {
                    hashSet2.add(str.charAt(i));
                    arr[n++] = Integer.parseInt(String.valueOf(str.charAt(i)));
                }
            }
        }

        int[] resultArray = sort(arr);
        ArrayList<Integer> even = new ArrayList<>();
        int m = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] % 2 == 0) {
                even.add(resultArray[i]);
            }
        }

        if (even.size() == 0) {
            System.out.println(-1);
            return;
        }
        else {
            if (resultArray[resultArray.length - 1] % 2 != 0) {
                for (int i = (resultArray.length - 2); i >= 0; i--) {
                    if (resultArray[i] % 2 == 0) {
                        int temp = resultArray[resultArray.length - 1];
                        resultArray[resultArray.length - 1] = resultArray[i];
                        resultArray[i] = temp;
                        break;
                    }
                }
                long result = 0;
                for (int i = 0; i < resultArray.length; i++) {
                    result = result*10 + resultArray[i];
                }

                System.out.println(result);
            }
            else {
                long result = 0;
                for (int i = 0; i < resultArray.length; i++) {
                    result = result*10 + resultArray[i];
                }

                System.out.println(result);
            }
        }
    }
}
