package com.company.AES;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Input {
    public static byte[] Input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите расположение файла:");
        String ras = in.nextLine();
        byte[] array = null;
        try {
            array = Files.readAllBytes(Paths.get(ras));
        } catch (IOException e) {
            Input();
            e.printStackTrace();
        }
        return array;
    }
}
