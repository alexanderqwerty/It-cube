package com.company.AES;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class ChoiceEn {
    public static void text() throws UnsupportedEncodingException, NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        System.out.println("Метод шифрования 1-AES 2-RSA");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        switch (k) {
            case (1):
                String key;
                System.out.println("Введите 16 значный ключ");
                key = in.nextLine();
                key = in.nextLine();
                System.out.println("Выберите что будете шифровать:\n1-Ввод в консоль" +
                        "\n2-Прелбразование текста в файле"+
                        "\n3-Прелбразование любого файла");
                int num = in.nextInt();
                switch (num) {
                    case (1):
                        String text = in.nextLine();
                        text = in.nextLine();
                        AesText.textEn(key,text);
                    break;
                    case (2):
                        String text2 = TextFile.text().toString();
                        byte[] end = new byte[0];
                        try {
                            end = Encript.encrypt(key,text2);
                        } catch (GeneralSecurityException e) {
                            e.printStackTrace();
                        }
                        Output.out(end);
                        break;
                    case (3):
                        text2 = Input.Input().toString();
                        end = new byte[0];
                        try {
                            end = Encript.encrypt(key,text2);
                        } catch (GeneralSecurityException e) {
                            e.printStackTrace();
                        }
                        Output.out(end);
                        break;
                    default:
                        text();
                }
                break;
            case (2):

        }
    }
}

