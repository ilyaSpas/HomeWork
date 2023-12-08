package org.example.client;

import org.example.ServerWindow;

import java.io.IOException;

public class Client {
    private String name;
    private ClientView clientView;
    private ServerWindow server;
    private boolean connected;

    public Client(ClientView clientView, ServerWindow serverWindow) {
        this.clientView = clientView;
        this.server = serverWindow;
    }

    public void connectToServer(String name){
        this.name = name;
    }
    public void disconnect(){

    }
    public void sendMsg(String msg){

    }
    public void serverAnswer(String answer){

    }
    public void getName(){

    }
    public void printText(String text){

    }
}
