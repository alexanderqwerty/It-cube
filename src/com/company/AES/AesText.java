package com.company.AES;

import java.security.GeneralSecurityException;

public class AesText {
    public static void textEn(String key,String text){
        byte[] ciphertext = new byte[0];
        try {
            ciphertext = Encript.encrypt(key, text);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        System.out.println("encrypted value:" + new String(ciphertext));
    }
    public static void textDe(String key,String text){
        String ciphertext = "";
        try {
            ciphertext = Decrypt.decrypt(key, text.getBytes());
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("decrypted value:" + (Decrypt.decrypt(key, ciphertext.getBytes())));
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }
}
