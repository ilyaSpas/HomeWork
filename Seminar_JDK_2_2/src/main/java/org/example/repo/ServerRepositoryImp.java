package org.example.repo;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerRepositoryImp implements ServerRepository {
    private File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\" +
            "HW\\Seminar_JDK__2\\src\\main\\resources\\serverLog.txt");
    private DateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    @Override
    public void saveToServerLog(String msg) {
        String temp = timeNow() + msg + "\n";
        try (OutputStream outputStream = new FileOutputStream(file, true)) {
            outputStream.write(temp.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String serverLogAnswer() {
        try (InputStream inputStream = new FileInputStream(file)) {
            byte[] log = inputStream.readAllBytes();
            return new String(log);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateLog() {
        String temp = "";
        try (OutputStream outputStream = new FileOutputStream(file, false)) {
            outputStream.write(temp.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String timeNow() {
        Date date = new Date();
        return "[" + simpleDateFormat.format(date) + "] ";
    }
}
