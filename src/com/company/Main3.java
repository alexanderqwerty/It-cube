package com.company;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;

public class Main3 {

    public static void main(String[] args) {
        try {

            String key = "MySecretPas12345";
            // текст
            byte[] ciphertext = encrypt(key, "Меня зовут Николай Бондарь");
            System.out.println("encrypted value:" + new String(ciphertext));
            System.out.println("decrypted value:" + (decrypt(key, ciphertext)));

            byte[] array = null;
            try {
                array = Files.readAllBytes(Paths.get("C:\\Users\\duduc\\Desktop\\dcsb.PNG"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] cipher = encrypt(key, array);
            FileOutputStream f = null;
            try {
                f = new FileOutputStream("C:\\Users\\duduc\\Desktop\\Стойка-1х2м.png");
                f.write(cipher);
            } catch (IOException e) {
                e.printStackTrace();
            }

            cipher = decrypt(key, cipher, true);
            try {
                f = new FileOutputStream("C:\\Users\\duduc\\Desktop\\Стойка-1х2м2.png");
                f.write(cipher);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }

    public static byte[] encrypt(String key, String value)
            throws GeneralSecurityException {

        byte[] raw = key.getBytes();
        if (raw.length != 16) {
            throw new IllegalArgumentException("Invalid key size.");
        }

        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec,
                new IvParameterSpec(new byte[16]));
        return cipher.doFinal(value.getBytes());
    }

    public static byte[] encrypt(String key, byte[] value)
            throws GeneralSecurityException {

        byte[] raw = key.getBytes();
        if (raw.length != 16) {
            throw new IllegalArgumentException("Invalid key size.");
        }

        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec,
                new IvParameterSpec(new byte[16]));
        return cipher.doFinal(value);
    }

    public static byte[] decrypt(String key, byte[] encrypted, boolean flag)
            throws GeneralSecurityException {

        byte[] raw = key.getBytes();
        if (raw.length != 16) {
            throw new IllegalArgumentException("Invalid key size.");
        }
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec,
                new IvParameterSpec(new byte[16]));
        byte[] original = cipher.doFinal(encrypted);

        return original;
    }

    public static String decrypt(String key, byte[] encrypted)
            throws GeneralSecurityException {

        byte[] raw = key.getBytes();
        if (raw.length != 16) {
            throw new IllegalArgumentException("Invalid key size.");
        }
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec,
                new IvParameterSpec(new byte[16]));
        byte[] original = cipher.doFinal(encrypted);

        return new String(original);
    }
}