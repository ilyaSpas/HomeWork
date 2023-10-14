package org.example;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Chat extends JPanel {
    private JTextArea textArea;
    private JScrollPane jScrollPane;
    private File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\HW\\" +
            "Seminar_JDK_1\\src\\main\\resources\\log.txt");

    Chat() {
        textArea = new JTextArea(17, 34);
        jScrollPane = new JScrollPane(textArea);
        add(jScrollPane);
    }


    void initialize() throws IOException {
        try (InputStream inputStream = new FileInputStream(file)) {
            byte[] log = inputStream.readAllBytes();
            textArea.setText(new String(log));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void setChatTextArea(String chatLog) {
        textArea.setText(chatLog);
    }

}
