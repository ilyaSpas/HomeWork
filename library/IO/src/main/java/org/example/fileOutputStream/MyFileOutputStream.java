package org.example.fileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\text.xlsx");
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            byte[] buffer = "Hello world!\tHello world!\tHello world!".getBytes();
            outputStream.write(buffer);
        }
    }
}
