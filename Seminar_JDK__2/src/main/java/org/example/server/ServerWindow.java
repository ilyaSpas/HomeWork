package org.example.server;

import org.example.client.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame implements ServerView {
    private static final int WINDOW_POS_X = 200;
    private static final int WINDOW_POX_Y = 300;
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 400;
    JButton btnStart, btnStop;
    JTextArea textArea;
    JScrollPane jScrollPane;
    JLabel jLabel, jLabelStatus;
    private Server server;

    public ServerWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POX_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Server");
        setResizable(false);

        server = new Server(this);
        server.updateLog();

        init();

        setVisible(true);
    }

    private void init() {
        add(createTop(), BorderLayout.NORTH);
        add(createCenter());
        add(createBottom(), BorderLayout.SOUTH);
    }
    private Component createTop(){
        JPanel panelTop = new JPanel(new GridLayout(1, 3));

        jLabelStatus = new JLabel("Статус сервера: ");
        panelTop.add(jLabelStatus);

        jLabel = new JLabel("Сервер не активен.");
        panelTop.add(jLabel);

        return panelTop;
    }
    private Component createCenter(){
        textArea = new JTextArea();
        jScrollPane = new JScrollPane(textArea);

        return jScrollPane;
    }
    private Component createBottom(){
        JPanel panelTop = new JPanel(new GridLayout(1, 2));

        btnStart = new JButton("Start");
        panelTop.add(btnStart);

        btnStop = new JButton("Stop");
        panelTop.add(btnStop);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.start();
                jLabel.setText("Сервер запущен.");
                textArea.setText(server.getLog());
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.stop();
                jLabel.setText("Сервер не активен.");
                textArea.setText(server.getLog());
            }
        });

        return panelTop;
    }

    @Override
    public void sendChatMessage(String message) {
        server.sendChatMessage(message);
    }

    @Override
    public void loginUser(Client client) {
        server.loginUser(client);
    }

    @Override
    public String getChatLog() {
        return server.getChatLog();
    }
}
