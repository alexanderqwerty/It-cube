package com.company;

import com.company.AES.ChoiceDe;
import com.company.AES.ChoiceEn;
import com.company.AES.TextFile;

import java.util.Scanner;

public class Main extends TextFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите способ шифрования(1-AES,2-RSA)");
        Choice.choice();


    }

    public static class Choice {
        public static void choice() {
            Scanner in = new Scanner(System.in);
            System.out.println("1-Шифрование или 2-Разшифровка");
            int f = in.nextInt();
            switch (f) {
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
}
