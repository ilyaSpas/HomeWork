package org.example.fileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\HW\\" +
                "library\\IO\\src\\main\\resources\\text.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        byte[] buffer = "Hello, world!".getBytes();
        outputStream.write(buffer);
        outputStream.close();
    }
}
