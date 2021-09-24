package com.Releationship;

public class Main {

    public static double median(int input1[], int input2[]) {
        if (input1.length > input2.length) {
            return median(input2, input1);
        }

        int x = input1.length;
        int y = input2.length;
        int low = 0;
        int high = x;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxleftX = (partitionX == 0) ? Integer.MIN_VALUE : input1[partitionX - 1];
            int minrightX = (partitionX == 0) ? Integer.MAX_VALUE : input1[partitionX];

            int maxleftY = (partitionY == 0) ? Integer.MIN_VALUE : input2[partitionY - 1];
            int minrightY = (partitionY == 0) ? Integer.MAX_VALUE : input2[partitionY];

            if(maxleftX <= minrightY && maxleftY <= minrightX) {
                if((x + y) % 2 == 0) {
                    return ((double)Math.max(maxleftX, maxleftY) + Math.min(minrightX, minrightY)) / 2;
                }
                else {
                    return Math.max(maxleftX, maxleftY);
                }
            }
            else if (maxleftX > minrightY) {
                high = partitionX - 1;
            }
            else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        int input1[] = {1, 3, 8, 9, 15};
        int input2[] = {7, 11, 18, 19, 21, 25};

        System.out.println("The median of two sorted arrays is :- " + median(input1, input2));
    }
}
