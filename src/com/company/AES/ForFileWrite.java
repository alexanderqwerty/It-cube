package com.company.AES;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ForFileWrite {
    public static void Write(String text) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите полно расположение куда файл будет сохранён");
        String ras = in.nextLine();
        FileWriter fout = null;
        try {
            fout = new FileWriter(ras);
        } catch (IOException e) {
            e.printStackTrace();
        }
        fout.write(text);
    }
}
