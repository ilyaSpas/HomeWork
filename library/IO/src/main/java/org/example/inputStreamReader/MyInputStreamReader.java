package org.example.inputStreamReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        /**
         * InputStreamReader, в качестве аргумента принимает InputStream и кодировку
         */
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "UTF8")) {
            int data = reader.read();
            while (data != -1){
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
