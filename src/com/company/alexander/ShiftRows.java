package com.company.alexander;

public class ShiftRows {
    public static int[][] ShiftRows(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < i; k++) {
                int num = arr[i][0];
                for (int j = 1; j < arr[i].length; j++) {
                    arr[i][j - 1] = arr[i][j];
                }
                arr[i][arr[i].length - 1] = num;
            }
        }
        return arr;
    }
}
