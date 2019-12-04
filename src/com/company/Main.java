package com.company;
import com.company.*;
import com.company.AES.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите способ шифрования(1-AES,2-RSA)");
        int k = in.nextInt();
        ChoiceText.text(k);


    }
}
