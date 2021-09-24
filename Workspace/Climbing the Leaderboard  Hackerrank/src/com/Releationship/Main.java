package com.Releationship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        int[] scores = new int[ranked.size()];
        int[] playerScore = new int[player.size()];

        for (int i = 0; i < ranked.size(); i++) {
            scores[i] = ranked.get(i);
        }
        for (int i = 0; i < ranked.size(); i++) {
            System.out.println(scores[i]);
        }
        for (int i = 0; i < player.size(); i++) {
            playerScore[i] = player.get(i);
        }
        for (int i = 0; i < player.size(); i++) {
            System.out.println(playerScore[i]);
        }

        Integer[] result = new Integer[player.size()];
        int[] rank = new int[ranked.size()];
        Arrays.fill(rank, 1);

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == scores[i-1]) {
                rank[i] = rank[i-1];
            }
            else {
                rank[i] = rank[i-1] + 1;
            }
        }

        for (int i = 0; i < playerScore.length; i++) {
            if (playerScore[i] > scores[0]) {
                result[i] = 1;
            } else if (playerScore[i] < scores[scores.length - 1]) {
                result[i] = rank[rank.length - 1] + 1;
            } else {
                int index = binarySearch(scores, playerScore[i]);
                result[i] = rank[index];
            }
        }

        return Arrays.asList(result);
    }

    public static int binarySearch(int[] arr, int val) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == val) {
                return mid;
            }
            else if (arr[mid] < val && val < arr[mid - 1]) {
                return mid;
            }
            else if (arr[mid] > val && val >= arr[mid + 1]) {
                return mid + 1;
            }
            else if (arr[mid] < val) {
                end = mid - 1;
            }
            else if (arr[mid] > val) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ranked = new ArrayList<>();
	    List<Integer> player = new ArrayList<>();
	    int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            ranked.add(scanner.nextInt());
        }
	    int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            player.add(scanner.nextInt());
        }
        System.out.println(climbingLeaderboard(ranked, player));
    }
}
