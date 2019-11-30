package com.company.project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

public class AES {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {

            String key = Key.key();
            // текст
            byte[] ciphertext = Encript.encrypt(key, "Меня зовут Николай Бондарь");
            System.out.println("encrypted value:" + new String(ciphertext));
            System.out.println("decrypted value:" + (Decrypt.decrypt(key, ciphertext)));

            byte[] array = Input.Input(in.nextLine());

            byte[] cipher = Encript.encrypt(key, array);
            FileOutputStream f = null;
            try {
                f = new FileOutputStream("Стойка-1х2м.png");
                f.write(cipher);
            } catch (IOException e) {
                e.printStackTrace();
            }

            cipher = Decrypt.decrypt(key, cipher, true);
            try {
                f = new FileOutputStream("Стойка-1х2м2.png");
                f.write(cipher);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }
}
