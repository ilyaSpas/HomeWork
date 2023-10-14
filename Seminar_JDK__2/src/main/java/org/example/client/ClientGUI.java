package org.example.client;

import org.example.server.ServerWindow;

import javax.swing.*;
import java.awt.*;

public class ClientGUI extends JFrame implements ClientView{
    private static final int WINDOW_POS_X = 700;
    private static final int WINDOW_POX_Y = 300;
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 400;
    JButton btnLogin, btnLogOut, btnSend;
    JTextField textField, ipField, hostField, loginField;
    JPasswordField passField;
    JScrollPane jScrollPane;
    JTextArea textArea;
    JLabel jLabel, jLabelStatus;
    private Client client;

    public ClientGUI(ServerWindow server) {
        this.client = new Client(this, server);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POX_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Chat client");
        setResizable(false);

        init();

        setVisible(true);
    }

    private void init() {
        add(createTop(), BorderLayout.NORTH);
        add(createCenter());
        add(createBottom(), BorderLayout.SOUTH);
    }
    private Component createTop(){
        JPanel panelTop = new JPanel(new GridLayout(3, 3));

        loginField = new JTextField("Ivan Ivanovich");
        panelTop.add(loginField);

        passField = new JPasswordField("12345");
        panelTop.add(passField);

        btnLogin = new JButton("Login");
        panelTop.add(btnLogin);

        ipField = new JTextField("127.0.0.1");
        panelTop.add(ipField);

        hostField = new JTextField("8189");
        panelTop.add(hostField);

        btnLogOut = new JButton("Logout");
        panelTop.add(btnLogOut);

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

        textField = new JTextField();
        panelTop.add(textField);

        btnSend = new JButton("Send");
        panelTop.add(btnSend);

        return panelTop;
    }
}
