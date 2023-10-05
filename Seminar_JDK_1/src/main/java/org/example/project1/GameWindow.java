package org.example.project1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 502;
    private static final int WINDOW_POS_X = 800;
    private static final int WINDOW_POX_Y = 300;

    JButton btnStart = new JButton("New game");
    JButton btnExit = new JButton("Exit");

    SettingsWindow settingsWindow;
    Map map;

    GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POX_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("New game");
        setResizable(false);

        add(map = new Map(), BorderLayout.CENTER);

        JPanel panBottom = new JPanel(new GridLayout(1, 2));
        panBottom.add(btnStart);
        panBottom.add(btnExit);
        add(panBottom, BorderLayout.SOUTH);

        settingsWindow = new SettingsWindow(this);

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });


        setVisible(true);
    }

    public void starNewGame(int i, int i1, int i2, int i3) {
        map.startNewGame(i, i1, i2, i3);
    }
}
