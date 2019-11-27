package com.company;

import com.company.alexander.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Encoder {
    public static void out(String f) {
        System.out.print(f);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        ShiftRows.ShiftRows(arr);
        for (int k = 0;k<arr.length;k++ ) {
            for (int c = 0; c < arr.length; c++)
                System.out.print(arr[k][c] + " ");
            System.out.print("\n");
        }
       /* out("Введите расположение текста Например:C:\\Users\\user\\Desktop\\test.txt");
        String loc = in.nextLine();
        FileReader text = null;
        try {
            text = new FileReader(loc);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        out("Выбирите один из способов шифрования\n1-Шифр Фибаначи");
        Choice.choice(text, in.nextInt());
        */
    }
}