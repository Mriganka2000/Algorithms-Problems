package com.algorithm.java;

import java.util.Arrays;
import java.util.Comparator;

class Box implements Comparable<Box> {
    public int numberOfBoxes;
    public int numberOfUnitsPerBox;

    public Box(int numberOfBoxes, int numberOfUnitsPerBox) {
        this.numberOfBoxes = numberOfBoxes;
        this.numberOfUnitsPerBox = numberOfUnitsPerBox;
    }

    @Override
    public int compareTo(Box o) {
        return o.numberOfUnitsPerBox - this.numberOfUnitsPerBox;
    }
}

public class Main {

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Box[] boxes = new Box[boxTypes.length];

        for (int i = 0; i < boxTypes.length; i++) {
            boxes[i] = new Box(boxTypes[i][0], boxTypes[i][1]);
        }

        Arrays.sort(boxes);

        int maxUnits = 0, n = 0;

        while (truckSize != 0 && n < boxes.length) {
            if (truckSize >= boxes[n].numberOfBoxes) {
                truckSize -= boxes[n].numberOfBoxes;
                maxUnits += boxes[n].numberOfBoxes * boxes[n].numberOfUnitsPerBox;
            }
            else {
                maxUnits += truckSize * boxes[n].numberOfUnitsPerBox;
                truckSize -= truckSize;
            }
            n++;
        }

        return maxUnits;
    }

    public int maximumUnitsOptimized(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingInt(o -> -o[1]));
        int ans = 0, i = 0, n = boxTypes.length;
        while (i < n && truckSize > 0) {
            int maxi = Math.min(boxTypes[i][0], truckSize);
            ans += maxi * boxTypes[i][1];
            i++;
            truckSize -= maxi;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] boxTypes = {{1,3},{5,5},{2,5},{4,2},{4,1},{3,1},{2,2},{1,3},{2,5},{3,2}};
        int truckSize = 35;
        System.out.println(maximumUnits(boxTypes, truckSize));
    }

}