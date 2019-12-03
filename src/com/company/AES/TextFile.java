package com.company.AES;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {
    public static String text() {
        Scanner in = new Scanner(System.in);
        String ras = in.nextLine();
        String text = "";
        try {

            Scanner text3 = new Scanner(new File(ras));
            while (text3.hasNext())
                text += text3.nextLine() + "\r\n";
        } catch (IOException e) {
            text();
            e.printStackTrace();
        }
        return text;
    }
}