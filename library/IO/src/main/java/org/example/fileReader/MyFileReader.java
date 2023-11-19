package org.example.fileReader;

import java.io.*;

public class MyFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        try(Reader reader = new FileReader(file)) {
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
