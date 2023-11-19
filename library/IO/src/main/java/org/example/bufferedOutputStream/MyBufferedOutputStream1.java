package org.example.bufferedOutputStream;

import java.io.*;

public class MyBufferedOutputStream1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        File file1 = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text_copy.txt");

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file1))) {

            int data = in.read();

            while (data != -1){
                System.out.print((char) data);
                out.write(data);
                out.flush();
                data = in.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
