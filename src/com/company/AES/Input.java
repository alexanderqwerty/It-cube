package com.company.AES;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Input {
    public static byte[] Input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите расположение файла");
        String ras = in.nextLine();
        FileOutputStream f = null;
        byte[] array = null;
        try {
            array = Files.readAllBytes(Paths.get(ras));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }
}
