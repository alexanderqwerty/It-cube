package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Encoder {

    public static void out(String f) {
        System.out.print(f);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out("Введите расположение текста Например:C:\\Users\\user\\Desktop\\test.txt");
        String loc = in.nextLine();
        FileReader text = null;
        try {
            text = new FileReader(loc);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        out("Выбирите один из способов шифрования\n1-Шифр Фибаначи");
    }
}