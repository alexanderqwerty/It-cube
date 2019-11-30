package com.company.project;

import java.io.FileReader;
import java.util.Scanner;

public class ChoiceText {
    public static String text(int num){
        Scanner in = new Scanner(System.in);
        String text = null;
        switch (num){
            case(1):
                 text = in.nextLine();
            case(2):
            default:
                text(num);
        }
        return text;
    }
}
