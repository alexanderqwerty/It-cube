package com.company.RSA;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;

public class RSA {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String text = "hello";
        Cipher cipher = Cipher.getInstance("RSA");

        KeyPairGenerator pairgen = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = pairgen.generateKeyPair();
        PublicKey publicKey =  keyPair.getPublic();
        PrivateKey privateKey =  keyPair.getPrivate();

        cipher.init(Cipher.ENCRYPT_MODE, (java.security.Key) publicKey);

        byte[] bytes = cipher.doFinal(text.getBytes());
        for (byte b : bytes)
            System.out.print(b);
    }
}
