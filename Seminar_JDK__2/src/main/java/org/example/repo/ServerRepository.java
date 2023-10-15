package org.example.repo;

public interface ServerRepository {
    void saveToServerLog(String msg);
    String serverLogAnswer();
    void updateLog();
}
