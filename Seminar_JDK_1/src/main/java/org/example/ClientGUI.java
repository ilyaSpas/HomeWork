package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ClientGUI extends JFrame {
    private static final int WINDOW_POS_X = 500;
    private static final int WINDOW_POX_Y = 300;
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 400;
    JButton btnLogin = new JButton("Login");
    JButton btnLogOut = new JButton("LogOut");
    JButton btnSend = new JButton("send");
    JTextField textField = new JTextField();
    JTextField ipField = new JFormattedTextField();
    JTextField hostField = new JFormattedTextField();
    JTextField loginField = new JFormattedTextField();
    JPasswordField passField = new JPasswordField();
    Chat chat = new Chat();

    ClientGUI() throws IOException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POX_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("ClientGUI");
        setResizable(false);

        JPanel panelTop = new JPanel(new GridLayout(2, 3, 2, 3));
        loginField.setText("Ivan Ivanovich");
        panelTop.add(loginField);
        passField.setText("12345");
        panelTop.add(passField);
        panelTop.add(btnLogin);
        ipField.setText("127.0.0.1");
        panelTop.add(ipField);
        hostField.setText("8189");
        panelTop.add(hostField);
        add(panelTop, BorderLayout.NORTH);

        add(chat);

        JPanel panelBottom = new JPanel(new GridLayout());
        panelBottom.add(textField);
        panelBottom.add(btnSend);
        add(panelBottom, BorderLayout.SOUTH);

        setVisible(true);

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
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelTop.setVisible(false);
            }
        });

    }


}
