package com.company.AES;

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
                        "\n2-Выбор текстового файла" +
                        "\n3-Прелбразование любого файла");
                int num = in.nextInt();
                switch (num) {
                    case (1):
                        String text = in.nextLine();
                        text = in.nextLine();
                        AesText.text(key,text);
                    break;
                }
                break;
            case (2):

        }
    }
}

