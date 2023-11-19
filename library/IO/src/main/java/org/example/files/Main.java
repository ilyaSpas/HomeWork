package org.example.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Класс Files, работает только с объектами класса Path, не с File.
         */
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text.xlsx");
        if (!file.exists()) {
            file.createNewFile();
        }
        Path path = file.toPath();

        File file1 = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\Text1.xlsx");
        Path path1 = file1.toPath();

        File file2 = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\HW\\Text1.xlsx");
        Path path2 = file1.toPath();

        copy(path, path1);

        Files.move(file.toPath(), file2.toPath());
    }

    /**
     * При копирование файла, копия не должна существовать.
     *
     * @param path  - существующий копируемый файл.
     * @param path1 - файл создается программой.
     */
    public static void copy(Path path, Path path1) {
        try {
            Files.copy(path, path1);
        } catch (IOException e) {
            System.out.println("Файл уже существет.");
        }
    }

    public static void copy(File file, File file1) throws IOException {
        Files.copy(file.toPath(), file1.toPath());
    }

    /**
     * Перемещает файл
     * @param path - из первого пути
     * @param path1 - во второй
     * @throws IOException
     */
    public static void move(Path path, Path path1) throws IOException {
        Files.move(path, path1);
    }

    public static void move(File file, File file1) throws IOException {
        Files.move(file.toPath(), file1.toPath());
    }
}