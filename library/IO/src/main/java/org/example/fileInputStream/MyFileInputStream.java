package org.example.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyFileInputStream {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\HW\\" +
                "library\\IO\\src\\main\\resources\\text.txt");
        FileInputStream inputStream = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, bytesRead));
        }
        inputStream.close();
    }
}
