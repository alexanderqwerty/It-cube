package com.company.AES;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

public class Output {
    public static void out(byte[] cipher) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите полное расположение куда файл будет сохранён");
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
