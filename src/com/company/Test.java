package com.company;

import java.io.File;

public class Test {

    private static boolean flag;

    public static void main(String[] args) {
        func("c:\\", "nati.TXT");
    }

    private static void func(String path, String find) {
        File f = new File(path);
        String[] list = f.list();

        if (list != null) {
            for (String file : list) {

                if (find.equals(file)) {
                    flag = true;
                    return;
                }
                if (!path.endsWith("\\\\")) {
                    path += "\\\\";
                }

                File tempfile = new File(path, file);
                if (!file.equals(".") && !file.equals("..")) {
                    if (tempfile.isDirectory()) {
                        func(path + file, find);
                        if (flag) {
                            System.out.println(path + file + "\\\\" + find);
                            return;
                        }
                    }
                }
            }
        }
    }
}
