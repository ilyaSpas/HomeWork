package org.example.bufferedInputStream;

import java.io.*;

public class MyBufferedInputStream1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
            int data = in.read();
            while (data != -1){
                System.out.print((char) data);
                data = in.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
