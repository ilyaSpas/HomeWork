package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static final Random random = new Random();
    private static int CHAR_BOUND_L = 65;
    private static int CHAR_BOUND_H = 90;
    private static final String TO_SEARCH = "GB";

    public static void main(String[] args) throws IOException {
        writeFileContent("file1.txt",500);
        writeFileContent("file2.txt",500);
        concatenate("file1.txt", "file2.txt", "conFile1.txt");
        System.out.println(findStr("conFile1.txt", TO_SEARCH));
    }

    public static String generateSymbols(int count) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            int j = random.nextInt(CHAR_BOUND_L, CHAR_BOUND_H + 1);
            char h = (char) j;
            stringBuilder.append(h);
        }

        return stringBuilder.toString();
    }

    public static void writeFileContent(String fileName, int length) throws IOException {

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.write(generateSymbols(length).getBytes());
        }
    }

    public static void writeFileContent(String fileName, int length, int i) throws IOException {

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
                if (random.nextInt(i) == 0){
                    fileOutputStream.write(TO_SEARCH.getBytes());
                }
                fileOutputStream.write(generateSymbols(length).getBytes());
        }
    }

    public static void concatenate(String fileName1, String fileName2, String fileOut) throws IOException {
        //запись
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileOut)) {
            int c;
            //чтение
            try (FileInputStream fileInputStream = new FileInputStream(fileName1)) {
                while ((c = fileInputStream.read()) != -1) {
                    fileOutputStream.write(c);
                }
            }

            try (FileInputStream fileInputStream = new FileInputStream(fileName2)) {
                while ((c = fileInputStream.read()) != -1) {
                    fileOutputStream.write(c);
                }
            }
        }
    }

    public static boolean findStr(String fileName, String strToFind) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            byte[] searchData = strToFind.getBytes();
            int c;
            int i = 0;
            while ((c = fileInputStream.read()) != -1) {
                if(c == searchData[i]){
                    i++;
                }
                else {
                    i = 0;
                    if (c == searchData[i]){
                        i++;
                        continue;
                    }
                }
                if( i == searchData.length){
                    return true;
                }
            }

        }
        return false;
    }
}