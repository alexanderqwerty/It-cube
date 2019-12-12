package com.company.AES;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

import static com.company.AES.AesText.textDe;

public class ChoiceDe {
    public static void text() throws UnsupportedEncodingException, GeneralSecurityException {
        Scanner in = new Scanner(System.in);
        System.out.println("Метод разшифровывания 1-AES 2-RSA");
        int k = in.nextInt();
        switch (k) {
            case (1):
                String key;
                System.out.println("Введите 16 значный ключ");
                key = in.nextLine();
                key = in.nextLine();
                System.out.println("Выберите что будете разшифровывать:\n1-Ввод в консоль" +
                        "\n3-Прелбразование любого файла");
                int num = in.nextInt();
                switch (num) {
                    case (1):
                        String text = in.nextLine();
                        text = in.nextLine();
                        textDe(key, text);
                        break;
                    case (2):

//                        end = Decrypt.decrypt(key,Base64.getDecoder().decode(text2));
//                        Output.out(Base64.getDecoder().decode(end));
                        break;
                    case (3):
                        byte[] text2 = Input.Input();
                        byte[] end = new byte[0];
                        try {
                            end = Decrypt.decrypt(key, text2, true);
                        } catch (GeneralSecurityException e) {
                            e.printStackTrace();
                        }
                        Output.out(end);
                        Output.out(text2);
                        break;
                    default:
                        text();
                }
                break;
            case (2):

        }
    }
}