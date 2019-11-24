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
                Caesar.caeser(text,in.nextInt());
            default:
                out("Вы ввели либо не число либо число которого нет в предложенном ");
                choice(text,in.nextInt());
        }
    }
}
