package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {
    private boolean serverState;
    private static final int WINDOW_POS_X = 500;
    private static final int WINDOW_POX_Y = 300;
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 400;
    JButton btnStart = new JButton("Start");
    JButton btnStop = new JButton("Stop");
    ServerWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POX_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("ServerWindow");
        setResizable(false);

        JPanel panelBottom = new JPanel(new GridLayout(1, 2, 2, 3));
        panelBottom.add(btnStart);
        panelBottom.add(btnStop);
        add(panelBottom, BorderLayout.SOUTH);

        setVisible(true);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (serverState){
                    System.out.println("Сервер уже работает.");
                } else {
                    System.out.println("Сервер запущен.");
                    serverState = true;
                }

            }
        });
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (serverState){
                    System.out.println("Сервер прервал свою работу.");
                    serverState = false;
                } else {
                    System.out.println("Сервер уже выключен.");
                }
            }
        });
    }
}
