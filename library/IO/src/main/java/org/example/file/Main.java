package org.example.file;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.xlsx");
        if (!file.exists()){
            file.createNewFile();
        }

        File dir = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\");

        String[] strings = dir.list();
        System.out.println(dir.isDirectory());
        System.out.println(dir.getAbsoluteFile());
        System.out.println(file.isFile());
    }
}
