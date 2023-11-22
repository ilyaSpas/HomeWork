package org.example.dataInputStream;

import java.io.*;

public class MyDataInputStream {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        File file1 = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text_copy.txt");

        try (DataInputStream in = new DataInputStream(new FileInputStream(file1))) {

//            byte[] data = in.readAllBytes();
//            System.out.println(new String(data, StandardCharsets.UTF_8));

            String str = in.readUTF();
            System.out.println(str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
