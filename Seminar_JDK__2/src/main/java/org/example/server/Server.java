package org.example.server;

import org.example.client.ClientGUI;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private ServerView serverView;
    List<ClientGUI> clientGUIList;

    public Server(ServerView serverView) {
        this.serverView = serverView;
        clientGUIList = new ArrayList<>();
    }
}
