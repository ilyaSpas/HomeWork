package org.example.repo;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRepositoryImp implements ChatRepository{
    private File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\" +
            "HW\\Seminar_JDK__2\\src\\main\\resources\\chatLog.txt");
    private DateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
    @Override
    public void saveToChatLog(String message) {
        String temp = timeNow() + message + "\n";
        try (OutputStream outputStream = new FileOutputStream(file, true)) {
            outputStream.write(temp.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String chatLogAnswer() {
        try (InputStream inputStream = new FileInputStream(file)) {
            byte[] log = inputStream.readAllBytes();
            return new String(log);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private String timeNow() {
        Date date = new Date();
        return "[" + simpleDateFormat.format(date) + "] ";
    }
}
