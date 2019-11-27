package com.company.alexander;

public class ShiftRows {
    public static int[][] ShiftRows(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                if (i > 0) {
                    for (int k = 0; k < i; k++) {
                        int num = arr[i][k];
                        for (int c= 0; c<4;c++) {
                            if (c > 0)
                                arr[i][c - 1] = arr[i][c];
                        }
                        arr[i][3]=num;
                    }
                }
            }
        return arr;
    }
}
