package com.company.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Input {
    public static byte[] Input(String f) {
        byte[] array = null;
        try {
            array = Files.readAllBytes(Paths.get(f));
        } catch (IOException e) {
            System.out.print("Произошла ошибка попробуйте снова");
            Input(f);
            e.printStackTrace();
        }
        return array;
    }
}
