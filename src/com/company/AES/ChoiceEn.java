package com.company.AES;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

public class ChoiceEn {
    public static void text() throws UnsupportedEncodingException, NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {

        Scanner in = new Scanner(System.in);

        String key = "";
        while (key.length() != 16) {
            System.out.println("Введите 16 значный ключ");
            key = in.nextLine();
        }
        System.out.println("Выберите что будете шифровать:\n\t1-Ввод в консоль" +
                "\n\t2-Прелбразование текста в файле" +
                "\n\t3-Прелбразование любого файла");
        int num = in.nextInt();
        in.nextLine();
        switch (num) {
            case (1):
                System.out.println("Введите текст:");
                String text = in.nextLine();
                AesText.textEn(key, text);
                break;
            case (2):
                byte[] text2 = TextFile.text();
                try {
                    text2 = Encript.encrypt(key, text2);
                } catch (GeneralSecurityException e) {
                    e.printStackTrace();
                }
                Output.out(Base64.getEncoder().encodeToString(text2));
                break;
            case (3):
                byte[] fileBytes = Input.Input();
                try {
                    fileBytes = Encript.encrypt(key, fileBytes);
                } catch (GeneralSecurityException e) {
                    e.printStackTrace();
                }
                Output.out(fileBytes);
                break;
            default:
                text();
        }
    }
}


