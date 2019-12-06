package com.company.AES;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {
    public static byte[] text() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите польное расположение файла(C:\\\\Users\\\\Student\\\\Desktop)");
        String ras = in.nextLine();
        StringBuilder text = new StringBuilder();
        try {
            Scanner text3 = new Scanner(new FileReader(ras));
            while (text3.hasNext())
                text.append(text3.nextLine()).append("\r\n");
        } catch (IOException e) {
            text();
            e.printStackTrace();
        }
        return text().toString().getBytes();
    }
}