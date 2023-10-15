package org.example.server;

import org.example.client.Client;

public interface ServerView {
    void sendChatMessage(String message);

    void loginUser(Client client);

    String getChatLog();
}
