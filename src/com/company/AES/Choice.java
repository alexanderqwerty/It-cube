package com.company.AES;

import java.util.Scanner;

public class Choice {
    public static void choice(){
        Scanner in = new Scanner(System.in);
        System.out.println("1-Шифрование или 2-Разшифровка");
        int f =in.nextInt();
        switch (f){
            case (1):
                ChoiceEn.text();
                break;
            case (2):
                ChoiceDe.text();
                break;
            default:
                choice();
        }
    }
}
