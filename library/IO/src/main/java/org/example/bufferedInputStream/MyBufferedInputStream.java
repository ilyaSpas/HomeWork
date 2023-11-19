package org.example.bufferedInputStream;

import java.io.*;
import java.nio.file.Path;

public class MyBufferedInputStream {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.txt");
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
            byte[] data = new byte[1024];
            int amountData = in.read(data, 0, 1024);

            while (amountData != -1 && amountData == 1024){
                stringBuilder.append(new String(data, "UTF8"));
                amountData = in.read(data, 0, 1024);
            }

            if (amountData != -1) {
                byte[] res = new byte[amountData];
                System.arraycopy(data, 0, res, 0, res.length);
                stringBuilder.append(new String(res, "UTF8"));
            }

            System.out.println(stringBuilder);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
