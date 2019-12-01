package com.company.AES;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

public class AES {

    public static void File(String key) {
        Scanner in = new Scanner(System.in);

        byte[] array = Input.Input(in.nextLine());

        byte[] cipher = new byte[0];
        try {
            cipher = Encript.encrypt(key, array);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        FileOutputStream f = null;
            try {
                f = new FileOutputStream("Стойка-1х2м.png");
                f.write(cipher);
            } catch (IOException e) {
                e.printStackTrace();
            }

        try {
            cipher = Decrypt.decrypt(key, cipher, true);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        try {
                f = new FileOutputStream("Стойка-1х2м2.png");
                f.write(cipher);
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
