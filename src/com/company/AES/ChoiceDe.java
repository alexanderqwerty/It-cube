package com.company.AES;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Base64;
import java.util.Scanner;

import static com.company.AES.AesText.textDe;

public class ChoiceDe {
    public static void text() throws UnsupportedEncodingException, GeneralSecurityException {
        Scanner in = new Scanner(System.in);
        String key = "";
        while (key.length() != 16) {
            System.out.println("Введите 16 значный ключ");
            key = in.nextLine();
        }
        System.out.println("Выберите что будете разшифровывать:\n1-Ввод в консоль" +
                "\n2-Расшифровка текста в файле" +
                "\n3-Прелбразование любого файла");
        int num = in.nextInt();
        switch (num) {
            case (1):
                System.out.println("Введите текст:");
                String text = in.nextLine();
                text = in.nextLine();
                textDe(key, text);
                break;
            case (2):

                byte[] textBytes = Base64.getDecoder().decode(TextFile.getTextInFileBase64());
                String out = null;
                try {
                    out = Decrypt.decrypt(key, textBytes);
                } catch (GeneralSecurityException e) {
                    e.printStackTrace();
                }
                Output.out(out, TextFile.getFilePath());
                break;
            case (3):
                byte[] fileBytes = Input.Input();
                try {
                    fileBytes = Decrypt.decrypt(key, fileBytes, true);
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
