package org.example.repo;

public interface ChatRepository {
    void saveToChatLog(String message);
    String chatLogAnswer();
}
