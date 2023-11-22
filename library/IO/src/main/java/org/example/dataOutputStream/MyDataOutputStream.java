package org.example.dataOutputStream;

import java.io.*;

public class MyDataOutputStream {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        File file1 = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text_copy.txt");

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file1));) {
            out.writeUTF("HELLO WORLD!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
