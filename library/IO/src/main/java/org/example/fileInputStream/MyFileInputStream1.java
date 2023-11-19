package org.example.fileInputStream;

import java.io.*;

public class MyFileInputStream1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.xlsx");
        String str;
        StringBuilder stringBuilder = new StringBuilder();

        try (InputStream in = new FileInputStream(file)) {
            int data = in.read();
            while (data != - 1){
                stringBuilder.append((char) data);
                data = in.read();
            }

            System.out.println(str = new String(stringBuilder));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
