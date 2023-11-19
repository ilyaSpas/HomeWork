package org.example.bufferedReader;

import java.io.*;

public class MyBufferedReader {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        File file1 = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text_copy.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String str = reader.readLine();
            while (str != null){
                System.out.println(str);
                str = reader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
