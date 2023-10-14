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

    Chat() {
        textArea = new JTextArea(17, 34);
        setText("Сервер не активен.");
        jScrollPane = new JScrollPane(textArea);
        add(jScrollPane);
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

    public void setText(String chatLog) {
        textArea.setText(chatLog);
    }

}
