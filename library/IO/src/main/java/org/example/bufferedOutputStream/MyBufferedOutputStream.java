package org.example.bufferedOutputStream;

import java.io.*;
import java.nio.file.Path;

public class MyBufferedOutputStream {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        File file1 = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text_copy.txt");
        int bufferSize = 1024 * 8;
        int indexStartReading = 0;

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file1))) {

            byte[] dataBuffer = new byte[bufferSize];
            int dataLength = in.read(dataBuffer, indexStartReading, bufferSize);

            while (dataLength != -1){
                out.write(dataBuffer, 0, dataLength);
                out.flush();
                dataLength = in.read(dataBuffer, indexStartReading, bufferSize);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
