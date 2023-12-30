package org.example.server;

import java.net.ServerSocket;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        try {
            ServerSocket serverSocket = new ServerSocket(1400);
            Server server = new Server(serverSocket);
            server.runServer();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}