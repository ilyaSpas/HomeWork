package org.example.bufferedWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyBufferedWriter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        File file1 = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text_copy.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file1))) {
            writer.write("Hello world!@@@");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
