package org.example.dao;

public interface Dao <K, V>{
    void save(V object);
}
