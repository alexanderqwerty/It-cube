package com.company.AES;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Output {
    //Вывод байтов с запросом пути файла
    public static void out(byte[] cipher) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите полное расположение файла и его название (куда он будет сохранён)");
        String ras = in.nextLine();
        FileOutputStream f = null;
        try {
            f = new FileOutputStream(ras);
            f.write(cipher);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Вывод строки с запросом пути файла
    public static void out(String cipher) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите полное расположение файла и его название (куда он будет сохранён)");
        String ras = in.nextLine();
        FileWriter f = null;
        try {
            f = new FileWriter(ras);
            f.write(cipher);
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Вывод строки в уже имеющийся файл
    public static void out(String cipher, String filePath) {
        Scanner in = new Scanner(System.in);
        FileWriter f = null;
        try {
            f = new FileWriter(filePath);
            f.write(cipher);
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
