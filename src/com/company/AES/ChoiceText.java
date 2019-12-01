package com.company.AES;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ChoiceText {
    public static String text() {
        Scanner in = new Scanner(System.in);
        String text = "";
        int num = in.nextInt();
        switch (num) {
            case (1):
                text = in.nextLine();
                break;
            case (2):
                String ras = in.nextLine();
                try {

                    Scanner text3 = new Scanner(new File(ras));
                    while (text3.hasNext())
                        text += text3.nextLine() + "\r\n";
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                text();
        }
        return text;
    }
}
