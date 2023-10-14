package org.example.client;

import org.example.server.ServerWindow;

public class Client {
    private String name;
    private boolean connected;
    private ClientView clientView;
    private ServerWindow server;

    public Client(ClientView clientView, ServerWindow serverWindow) {
        this.clientView = clientView;
        this.server = serverWindow;
    }
    private boolean connectToServer(String name){
        return true;
    }
}
