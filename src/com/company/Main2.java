//package com.company;
//import javax.crypto.Cipher;
//import javax.crypto.spec.IvParameterSpec;
//import javax.crypto.spec.SecretKeySpec;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.security.GeneralSecurityException;
//import java.util.Base64;
//import java.util.Base64.Encoder;
//
//
//public class Main2 {
//    public static void main(String[] args){
//        try {
//
//            String key = "1234123412341234";
//            byte[] ciphertext = encrypt(key, "Пример работы алгоритма".getBytes("utf-8"));
//            String res = Base64.getEncoder().encodeToString(ciphertext);
//            System.out.println("encrypted value:" + res);
//            System.out.println("decrypted value:" + (decrypt(key, Base64.getDecoder().decode(res))));
//
//
//
//        } catch (GeneralSecurityException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//    }
//    public static byte[] encrypt(String key, byte[] value)
//            throws GeneralSecurityException {
//
//        byte[] raw = key.getBytes();
//        if (raw.length != 16) {
//            throw new IllegalArgumentException("Invalid key size.");
//        }
//
//        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
//        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        cipher.init(Cipher.ENCRYPT_MODE, skeySpec,
//                new IvParameterSpec(new byte[16]));
//        return cipher.doFinal(value);
//    }
//    public static String decrypt(String key, byte[] encrypted)
//            throws GeneralSecurityException {
//
//        byte[] raw = key.getBytes();
//        if (raw.length != 16) {
//            throw new IllegalArgumentException("Invalid key size.");
//        }
//        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
//
//        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        cipher.init(Cipher.DECRYPT_MODE, skeySpec,
//                new IvParameterSpec(new byte[16]));
//        byte[] original = cipher.doFinal(encrypted);
//
//        return new String(original);
//    }
//}
