package org.example;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Chat extends JPanel {
    private JTextArea textArea;
    private JScrollPane jScrollPane;
    private File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\HW\\" +
            "Seminar_JDK_1\\src\\main\\resources\\log.txt");
    DateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    Chat() throws IOException {
        textArea = new JTextArea(17, 34);
        jScrollPane = new JScrollPane(textArea);
        add(jScrollPane);

    }

    public void sendMSG(String msg) throws IOException {
        String oldText = textArea.getText();
        oldText = oldText + "\n" + timeNow() + msg;
        textArea.setText(oldText);
        saveMsg(msg);
        repaint();
    }

    private void saveMsg(String msg) throws IOException {
        String temp = timeNow() + msg + "\n";
        try (OutputStream outputStream = new FileOutputStream(file, true);) {
            outputStream.write(temp.getBytes());
        }
    }

    void initialize() throws IOException {
        try (InputStream inputStream = new FileInputStream(file);) {
            byte[] log = inputStream.readAllBytes();
            textArea.setText(new String(log));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    private String timeNow() {
        Date date = new Date();
        return "[" + simpleDateFormat.format(date) + "] ";
    }

}
