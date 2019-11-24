package com.company.alexander;

import com.company.alexander.*;
import java.io.FileReader;
import java.util.Scanner;

public class Choice {
    public static void out(String f) {
        System.out.print(f);
    }
    public static void choice(FileReader text, int num) {
        Scanner in = new Scanner(System.in);
        switch (num) {
            case (1):
                out("На сколько делать сдвиг?");
                Caesar.caeser(text,in.nextInt());
            case (2):
                out("какой ключ?");

            default:
                out("Вы ввели либо не число либо число которого нет в предложенном ");
                choice(text,in.nextInt());
        }
    }
}
