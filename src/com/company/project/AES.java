package com.company.project;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class AES {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
      String s = "Hello";

      Cipher cipher = Cipher.getInstance("AES");

      SecretKeySpec key = new SecretKeySpec("asdfghjklbipoooo".getBytes(),"AES");
      cipher.init(Cipher.ENCRYPT_MODE,key);
      byte[] bytes = cipher.doFinal(s.getBytes());
      for (byte i : bytes)
          System.out.print(i);
    }
}
