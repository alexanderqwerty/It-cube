package com.company.AES;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class TextFile {
    private static String filePath;
    public static byte[] text() throws UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
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
    public static String getTextInFileBase64() throws UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
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