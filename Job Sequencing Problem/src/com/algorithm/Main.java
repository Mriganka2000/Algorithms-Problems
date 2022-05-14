package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Job {
    public int id;
    public int deadline;
    public int profit;

    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Main {

    public static int maxProfit(ArrayList<Job> jobs, int deadline) {
        Collections.sort(jobs, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o2.profit - o1.profit;
            }
        });

        boolean[] slot = new boolean[deadline];
        int[] result = new int[deadline];
        int profit = 0;
        for (int i = 0; i < jobs.size(); i++) {
            for (int j = Math.min(deadline - 1, jobs.get(i).deadline - 1); j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = jobs.get(i).id;
                    profit += jobs.get(i).profit;
                    break;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        return profit;
    }

    public static void main(String[] args) {
        int deadline = 3;
        ArrayList<Job> jobs = new ArrayList<Job>();
        jobs.add(new Job(1, 2, 100));
        jobs.add(new Job(2, 1, 19));
        jobs.add(new Job(3, 2, 27));
        jobs.add(new Job(4, 1, 25));
        jobs.add(new Job(5, 3, 15));

        System.out.println(maxProfit(jobs, deadline));
    }
}
