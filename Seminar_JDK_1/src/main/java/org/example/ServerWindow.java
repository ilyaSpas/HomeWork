package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerWindow extends JFrame {
    boolean state;
    List<ClientGUI> clientGUIList;
    private static final int WINDOW_POS_X = 200;
    private static final int WINDOW_POX_Y = 300;
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 400;
    private File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\HW\\" +
            "Seminar_JDK_1\\src\\main\\resources\\serverWindowLog.txt");
    private File file2 = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\HW\\" +
            "Seminar_JDK_1\\src\\main\\resources\\log.txt");
    DateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
    private JTextArea textArea;
    private JScrollPane jScrollPane;
    JButton btnStart = new JButton("Start");
    JButton btnStop = new JButton("Stop");

    ServerWindow() throws IOException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POX_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("ServerWindow");
        setResizable(false);

        clientGUIList = new ArrayList<>();

        textArea = new JTextArea(17, 34);
        jScrollPane = new JScrollPane(textArea);
        add(jScrollPane, BorderLayout.CENTER);

        JPanel panelBottom = new JPanel(new GridLayout(1, 2, 2, 3));
        panelBottom.add(btnStart);
        panelBottom.add(btnStop);
        add(panelBottom, BorderLayout.SOUTH);

        reloadLog();

        setVisible(true);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (state){
                    System.out.println("Сервер уже работает.");
                    try {
                        saveLogMessage("Сервер уже работает.");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    System.out.println("Сервер запущен.");
                    try {
                        saveLogMessage("Сервер запущен.");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    state = true;
                }
                try {
                    textArea.setText(getLog());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        btnStop.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientGUIList.clear();
                if (state){
                    System.out.println("Сервер прервал свою работу.");
                    try {
                        saveLogMessage("Сервер прервал свою работу.");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    state = false;
                } else {
                    System.out.println("Сервер уже выключен.");
                    try {
                        saveLogMessage("Сервер уже выключен.");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                try {
                    updateLog();
                    //textArea.setText(getLog());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }

        });
    }
    public boolean connectUser(ClientGUI client){
        if (state){
            clientGUIList.add(client);
            return true;
        } else {
            return false;
        }
    }
    public void saveLogMessage(String msg) throws IOException {
        String temp = timeNow() + msg + "\n";
        try (OutputStream outputStream = new FileOutputStream(file, true);) {
            outputStream.write(temp.getBytes());
        }
    }

    public void reloadLog() throws IOException {
        String temp = "";
        try (OutputStream outputStream = new FileOutputStream(file, false);) {
            outputStream.write(temp.getBytes());
        }
    }

    public String getLog() throws IOException {
        try (InputStream inputStream = new FileInputStream(file);) {
            byte[] log = inputStream.readAllBytes();
            return new String(log);
        }
    }

    private void disConnectUser(ClientGUI client){
        clientGUIList.remove(client);
    }

    public void updateLog() throws IOException {
        textArea.setText(getLog());
    }

    private String timeNow() {
        Date date = new Date();
        return "[" + simpleDateFormat.format(date) + "] ";
    }

    public void saveMsg(String msg) throws IOException {
        String temp = timeNow() + msg + "\n";
        try (OutputStream outputStream = new FileOutputStream(file2, true);) {
            outputStream.write(temp.getBytes());
        }
    }

    public String getChatLog() throws IOException {
        try (InputStream inputStream = new FileInputStream(file2);) {
            byte[] log = inputStream.readAllBytes();
            return new String(log);
        }
    }
}
