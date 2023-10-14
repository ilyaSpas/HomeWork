package org.example;


import org.example.client.ClientGUI;
import org.example.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerWindow server = new ServerWindow();
        new ClientGUI(server);
        new ClientGUI(server);
    }
}