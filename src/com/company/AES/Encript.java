package com.company.AES;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

public class Encript {
    public static byte[] encrypt(String key, String value)
            throws GeneralSecurityException {

        byte[] raw = key.getBytes();
        if (raw.length != 16) {
            throw new IllegalArgumentException("Неверный размер ключа.");
        }

        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec,
                new IvParameterSpec(new byte[16]));
        return cipher.doFinal(value.getBytes(StandardCharsets.UTF_8));
    }
    public static byte[] encrypt(String key, byte[] value)
            throws GeneralSecurityException {
        byte[] raw = key.getBytes();
        if (raw.length != 16) {
            throw new IllegalArgumentException("Неверный размер ключа.");
        }

        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec,
                new IvParameterSpec(new byte[16]));
        return cipher.doFinal(value);
    }
}
