package com.company;

import com.company.AES.ChoiceDe;
import com.company.AES.ChoiceEn;
import com.company.AES.TextFile;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main extends TextFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Choice.choice();
        } catch (UnsupportedEncodingException | NoSuchPaddingException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | IllegalBlockSizeException | BadPaddingException | InvalidKeyException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }


    }
    public static class Choice {
        public static void choice() throws UnsupportedEncodingException, GeneralSecurityException {
            Scanner in = new Scanner(System.in);
            System.out.println("1-Шифрование или 2-Расшифровка");
            int f = in.nextInt();
            switch (f) {
                case (1):
                    ChoiceEn.text();
                    break;
                case (2):
                    ChoiceDe.text();
                    break;
                default:
                    choice();
            }
        }
    }
}
