package com.Releationship;

import java.util.*;

class Order {
    int customerNo;
    int orderNo;
    int prepTime;
    int serveTime;
}

public class Main {

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
        Order[] arr = new Order[orders.size()];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < orders.size(); i++) {
            arr[i] = new Order();
            arr[i].customerNo = i + 1;
            arr[i].orderNo = orders.get(i).get(0);
            arr[i].prepTime = orders.get(i).get(1);
            arr[i].serveTime = arr[i].prepTime + arr[i].orderNo;
        }

        Arrays.sort(arr, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.serveTime - o2.serveTime;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i].customerNo);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> orders = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(scanner.nextInt());
            list.add(scanner.nextInt());
            orders.add(list);
        }
        System.out.println(jimOrders(orders));
    }
}
