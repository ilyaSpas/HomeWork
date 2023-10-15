package org.example.server;

import org.example.client.Client;
import org.example.repo.ChatRepository;
import org.example.repo.ChatRepositoryImp;
import org.example.repo.ServerRepository;
import org.example.repo.ServerRepositoryImp;

import java.util.ArrayList;
import java.util.List;

public class Server {
    public boolean serverStatus = false;
    private ServerRepository serverRepository;
    private ChatRepository chatRepository;
    private ServerView serverView;
    public List<Client> clientGUIList;

    public Server(ServerView serverView) {
        this.serverView = serverView;
        clientGUIList = new ArrayList<Client>();
        serverRepository = new ServerRepositoryImp();
        chatRepository = new ChatRepositoryImp();
    }

    public void start() {
        if(!serverStatus){
            serverStatus = true;
            System.out.println("Сервер запущен.");
            serverRepository.saveToServerLog("Сервер запущен.");
        } else {
            System.out.println("Сервер уже запущен.");
            serverRepository.saveToServerLog("Сервер уже запущен.");
        }
    }

    public void stop() {
        if(serverStatus){
            serverStatus = false;
            System.out.println("Сервер прекратил свою работу.");
            serverRepository.saveToServerLog("Сервер прекратил свою работу.");
        } else {
            System.out.println("Сервер уже остановлен.");
            serverRepository.saveToServerLog("Сервер уже остановлен.");
        }
    }

    public String getLog(){
        return new String(serverRepository.serverLogAnswer());
    }
    public String getChatLog(){
        return chatRepository.chatLogAnswer();
    }

    public void updateLog() {
        serverRepository.updateLog();
    }

    public void sendChatMessage(String message) {
        chatRepository.saveToChatLog(message);
        allChatsUpdate();
    }

    public void loginUser(Client client) {
        clientGUIList.add(client);
    }
    public void allChatsUpdate(){
        for (Client client : clientGUIList){
            client.allChatsUpdate();
        }
    }
}
