package com.company.AES;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TextFile {
    private static String filePath;
    public static byte[] text() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите польное расположение файла(Пример C:\\\\Users\\\\Student\\\\Desktop):");
        filePath = in.nextLine();
        String text = "";
        try {
            Scanner text3 = new Scanner(new FileReader(filePath));
            while (text3.hasNext())
                text += text3.next();
        } catch (IOException e) {
            text();
            e.printStackTrace();
        }
        byte[] end = text.getBytes(StandardCharsets.UTF_8);
        return end;
    }

    public static String getTextInFileBase64() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите польное расположение файла(Пример C:\\\\Users\\\\Student\\\\Desktop):");
        filePath = in.nextLine();
        String text = "";
        try {
            Scanner text3 = new Scanner(new FileReader(filePath));
            while (text3.hasNext())
                text += text3.next();
        } catch (IOException e) {
            text();
            e.printStackTrace();
        }
        return text;
    }

    public static String getFilePath() {
        return filePath;
    }
}