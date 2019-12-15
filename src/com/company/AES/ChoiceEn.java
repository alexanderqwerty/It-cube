package com.company.AES;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Base64;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChoiceEn {
    public static void text() {

        Scanner in = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[A-z0-9]{16}");
        String key = "";
        Matcher matcher = pattern.matcher(key);
        while (!matcher.find()) {
            System.out.println("Введите 16 значный ключ (Используйте только латинские символы и цифры):");
            key = in.nextLine();
            matcher = pattern.matcher(key);
        }
        System.out.println("Выберите как будете шифровать:\n\t1-Ввод в консоль" +
                "\n\t2-Преобразование текста в файле" +
                "\n\t3-Преобразование любого файла");
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
                Output.out(Base64.getEncoder().encodeToString(text2), TextFile.getFilePath());
                System.out.println("Сделано!");
                break;
            case (3):
                byte[] fileBytes = Input.Input();
                try {
                    fileBytes = Encript.encrypt(key, fileBytes);
                } catch (GeneralSecurityException e) {
                    e.printStackTrace();
                }
                Output.out(fileBytes);
                System.out.println("Сделано!");
                break;
            default:
                text();
        }
    }
}


