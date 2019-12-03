package com.company.AES;

import java.io.File;

import java.io.IOException;

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

                break;
            default:
                text();
        }
        return text;
    }
}
