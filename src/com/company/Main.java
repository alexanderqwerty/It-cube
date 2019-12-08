package com.company;
import com.company.AES.*;

import java.util.Scanner;

public class Main extends TextFile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите способ шифрования(1-AES,2-RSA)");
        Choice.choice();


    }
}
