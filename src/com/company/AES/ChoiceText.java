package com.company.AES;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

public class ChoiceText {
    public static void text(int k) {
        Scanner in = new Scanner(System.in);
        switch (k) {
            case (1):
                String key;
                System.out.println("Введите 16 значный ключ");
                key = in.nextLine();
                System.out.println("Выберите что будете шифровать:\n1-Ввод в консоль" +
                        "\n2-Прелбразование любого файла");
                int num = in.nextInt();
                switch (num) {
                    case (1):
                        String text = in.nextLine();
                        text = in.nextLine();
                        AesText.text(key,text);
                    break;
                    case (2):
                        byte[] text2 = TextFile.text();
                        Output.out(text2);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + num);
                }
                break;
            case (2):

        }
    }
}

