package com.algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Pair {
    public long x;
    public long y;
    public long dist;

    public Pair(long x, long y, long dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            ArrayList<Pair> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long x = scanner.nextLong();
                long y = scanner.nextLong();
                arr.add(new Pair(x, y, (x * x + y * y)));
            }

            arr.sort(new Comparator<Pair>() {
                @Override
                public int compare(Pair a, Pair b) {
                    if (a.dist < b.dist)
                        return -1;
                    else if (a.dist > b.dist)
                        return 1;
                    else {
                        if (a.x + a.y < b.x + b.y) {
                            return -1;
                        } else if (a.x + a.y > b.x + b.y) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                }
            });

            long sum = 0;
            for (int i = 0; i < Math.min(n, k); i++) {
                sum += arr.get(i).x + arr.get(i).y;
            }

            System.out.println(sum);
        }
    }
}
