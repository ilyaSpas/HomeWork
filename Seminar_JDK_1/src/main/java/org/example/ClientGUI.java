package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientGUI extends JFrame {
    private static final int WINDOW_POS_X = 700;
    private static final int WINDOW_POX_Y = 300;
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 400;

    private ServerWindow server;
    JButton btnLogin = new JButton("Login");
    JButton btnLogOut = new JButton("LogOut");
    JButton btnSend = new JButton("Send");
    JTextField textField = new JTextField();
    JTextField ipField = new JFormattedTextField();
    JTextField hostField = new JFormattedTextField();
    JTextField loginField = new JFormattedTextField();
    JPasswordField passField = new JPasswordField();

    DateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
    Chat chat = new Chat();

    ClientGUI(ServerWindow server) throws IOException {
        this.server = server;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POX_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("ClientGUI");
        setResizable(false);

        init();

        setVisible(true);
    }

    private Component createTop() {
        JPanel panelTop = new JPanel(new GridLayout(2, 3, 2, 3));

        loginField.setText("Ivan Ivanovich");
        panelTop.add(loginField);
        passField.setText("12345");
        panelTop.add(passField);
        panelTop.add(btnLogOut);
        ipField.setText("127.0.0.1");
        panelTop.add(ipField);
        hostField.setText("8189");
        panelTop.add(hostField);
        panelTop.add(btnLogin);


        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (server.state) {
                    server.connectUser(ClientGUI.this);
                    try {
                        chat.initialize();
                        server.saveLogMessage(" Авторизован пользователь " + loginField.getText());
                        server.updateLog();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        btnLogOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server = null;
            }
        });

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    chat.sendMSG(loginField.getText() + ": " + textField.getText());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                textField.setText("");
            }
        });

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '\n') {
                    try {
                        chat.sendMSG(loginField.getText() + ": " + textField.getText());
                        textField.setText("");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });


        return panelTop;
    }

    private Component createBottom() {
        JPanel panelBottom = new JPanel(new GridLayout());
        panelBottom.add(textField);
        panelBottom.add(btnSend);
        return panelBottom;
    }

    private void init() {
        add(createTop(), BorderLayout.NORTH);
        add(chat);
        add(createBottom(), BorderLayout.SOUTH);
    }

    private String timeNow() {
        Date date = new Date();
        return "[" + simpleDateFormat.format(date) + "] ";
    }

}

