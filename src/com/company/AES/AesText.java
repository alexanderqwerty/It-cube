package com.company.AES;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Base64;

public class AesText {
    public static void textEn(String key,String text){
        byte[] ciphertext = new byte[0];
        try {
            ciphertext = Encript.encrypt(key, text);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        System.out.println("Зашифрованный текст:\n" + Base64.getEncoder().encodeToString(ciphertext));
    }

    public static void textDe(String key, String text) throws GeneralSecurityException {
        String ciphertext = "";
        ciphertext = (Decrypt.decrypt(key, Base64.getDecoder().decode(text)));
        System.out.println("Расшифрованный текст:\n" + ciphertext);
    }
}