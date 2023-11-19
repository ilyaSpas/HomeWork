package org.example.outputStreamWriter;

import java.io.*;

public class MyOutputStreamWriter {
    public static void main(String[] args) throws RuntimeException {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file), "UTF8")) {
            writer.write("Hello world!!! Hello world!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
