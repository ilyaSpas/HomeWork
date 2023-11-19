package org.example.fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        // Добавляется флаг для дозаписи
        try (Writer writer = new FileWriter(file, true)) {
            writer.write(" Hello world!!! Hello world!!! Hello world!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
