package com.company.AES;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.company.AES.AesText.textDe;

public class ChoiceDe {
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
        System.out.println("Выберите как будете расшифровывать:\n\t1-Ввод в консоль" +
                "\n\t2-Расшифровка текста в файле" +
                "\n\t3-Преобразование любого файла");
        int num = in.nextInt();
        in.nextLine();
        boolean error = true;
        while (error) {
            try {
                switch (num) {
                    case (1):
                        System.out.println("Введите текст:");
                        String text = in.nextLine();
                        textDe(key, text);
                        error = false;
                        break;
                    case (2):
                        byte[] textBytes = Base64.getDecoder().decode(TextFile.getTextInFileBase64());
                        String out = null;
                        out = Decrypt.decrypt(key, textBytes);
                        Output.out(out, TextFile.getFilePath());
                        System.out.println("Сделано!");
                        error = false;
                        break;
                    case (3):
                        byte[] fileBytes = Input.Input();
                        fileBytes = Decrypt.decrypt(key, fileBytes, true);
                        Output.out(fileBytes);
                        System.out.println("Сделано!");
                        error = false;
                        break;
                    default:
                        text();
                }
            } catch (GeneralSecurityException e) {
                if (num == 1)
                    System.out.println("Введенный текст не может быть разделен на блоки размером 16 байт," +
                            "проверьте ввод. И повторите операцию.");
                else {
                    System.out.println("Файл или информация в нем не может быть разделен(а) на блоки размером 16 байт," +
                            "проверьте его(её). И запустите программу заново.");
                    error = false;
                }
            } catch (IllegalArgumentException e){
                if (num == 1)
                    System.out.println("Введенный текст не является зашифрованым, проверьте ввод. И повторите операцию.");
                else {
                    System.out.println("Файл или информация в нем не является зашифрованым(ой)," +
                            "проверьте его(её). И запустите программу заново.");
                    error = false;
                }
            }
        }
    }
}
