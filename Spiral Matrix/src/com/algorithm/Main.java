package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int rowStart = 0, rowEnd = matrix.length - 1;
        int columnStart = 0, columnEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            for (int i = columnStart; i <= columnEnd; i++) {
                list.add(matrix[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                list.add(matrix[i][columnEnd]);
            }
            columnEnd--;

            if (rowStart <= rowEnd) {
                for (int i = columnEnd; i >= columnStart; i--) {
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (columnStart <= columnEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    list.add(matrix[i][columnStart]);
                }
            }
            columnStart++;
        }

        return list;
    }

    public static void main(String[] args) {
	    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
