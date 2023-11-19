package org.example.randomAccessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyRandomAccessFileR {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            int data = randomAccessFile.read();
            while (data != -1){
                System.out.print((char) data);
                data = randomAccessFile.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
