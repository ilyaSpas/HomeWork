package org.example.tast2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        prepareFile();
        loadFile();
    }




    public static void doProcess() throws Exception {
        if (random.nextInt(2) == 0) {
            throw new Exception("Случайная ошибка записи.");
        }
    }

    public static void prepareFile() {
        File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\" +
                "HW\\Seminar_Java_Core_4\\src\\main\\resources\\name.txt");
        try (FileWriter fileWriter = new FileWriter(file, false)) {
            fileWriter.write("Анна=4\n");
            fileWriter.write("Елена=5\n");
            fileWriter.write("Марина=6\n");
            //doProcess();
            fileWriter.write("Владимир=?\n");
            fileWriter.write("Константин=?\n");
            fileWriter.write("Иван=4\n");
            fileWriter.flush();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            //e.printStackTrace();
        }
    }
    public static void loadFile() {
        Map<String, Integer> map = new HashMap<>();
        try (FileReader fileReader = new FileReader("name.txt")){
            char[] buf = new char[256];
            int c;
            StringBuilder stringBuilder = new StringBuilder();
            while ((c = fileReader.read(buf)) > 0){
                for (int i = 0; i < c; i++) {
                    stringBuilder.append(buf[i]);
                }
            }
            String[] parts = stringBuilder.toString().split("\n");
            for (String part : parts){
                String[] rec = part.split("=");
                map.put(rec[0], parseInt(rec[0], rec[1]));
            }

            for (Map.Entry<String, Integer> e : map.entrySet()) {
                System.out.printf("%s = %d\n", e.getKey(), e.getValue());
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }


    private static int parseInt(String key, String value) throws Exception {
        try
        {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException e){
            if (!value.equals("?"))
                throw new Exception("Некорректный символ");
            return key.length();
        }
    }
}
