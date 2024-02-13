package org.example.client;

import org.example.repo.ChatRepository;
import org.example.repo.ChatRepositoryImp;
import org.example.server.ServerWindow;

public class Client {
    private String name;
    private boolean connected;
    private ClientView clientView;
    private ServerWindow server;
    private ChatRepository chatRepository;

    public Client(ClientView clientView, ServerWindow serverWindow) {
        this.clientView = clientView;
        this.server = serverWindow;
        chatRepository = new ChatRepositoryImp();
    }

    public void sendChatMessage(String message) {
        server.sendChatMessage(message);
    }

    public void loginUser() {
        server.loginUser(this);
    }

    public String getChatLoge() {
        return server.getChatLog();
    }

    public void allChatsUpdate() {
        clientView.updateChatLog();
    }
}
