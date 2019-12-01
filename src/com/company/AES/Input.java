package com.company.AES;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Input {
    public static byte[] Input(String f) {
        byte[] array = null;
        try {
            array = Files.readAllBytes(Paths.get(f));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }
}
