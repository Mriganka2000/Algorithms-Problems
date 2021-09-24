package com.Releationship;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static int countPie(ArrayList<Integer> arrayList, double d) {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            double div = arrayList.get(i) / d;
            int temp = (int) div;
            count = count + temp;
        }
        return count;
    }

    public static void findCakePie(ArrayList arrayList, int n) {
        HashMap<Double, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>(arrayList);
        Collections.sort(temp);
        int pcount = 0;
        double low = temp.get(0);
        double high = temp.get(n-1);
        double mid = low;

        DecimalFormat df = new DecimalFormat(".####");
        pcount = countPie(temp, mid);
        hashMap.put(Double.valueOf(mid), Integer.valueOf(pcount));

        while (true) {
            mid = (low + high) / 2;
            mid = Double.parseDouble(df.format(mid));
            if (mid == low || mid == high) {
                break;
            }
            if (hashMap.containsKey(mid)) {
                continue;
            }
            else {
                pcount = countPie(temp, mid);
                hashMap.put(Double.valueOf(mid), Integer.valueOf(pcount));
                if (pcount < n) {
                    high = mid;
                }
                else {
                    low = mid;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }
        findCakePie(arrayList, n);
    }
}
