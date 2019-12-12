package com.company.AES;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Output {
    public static void out(byte[] cipher) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите полно расположение куда файл будет сохранён и название");
        String ras = in.nextLine();
        FileOutputStream f = null;
        try {
            f = new FileOutputStream(ras);
            f.write(cipher);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
