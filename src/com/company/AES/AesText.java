package com.company.AES;

import java.security.GeneralSecurityException;

public class AesText {
    public static void text(String key,String text){
        byte[] ciphertext = new byte[0];
        try {
            ciphertext = Encript.encrypt(key, text);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        System.out.println("encrypted value:" + new String(ciphertext));
        try {
            System.out.println("decrypted value:" + (Decrypt.decrypt(key, ciphertext)));
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }
}
