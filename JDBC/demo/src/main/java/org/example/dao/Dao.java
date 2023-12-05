package org.example.dao;

import org.example.entity.User;

import java.util.List;
import java.util.Optional;

public interface Dao<K, V> {
    void create(V v);
    Optional<User> read(K k);
    void update(V v);
    void delete(K k);
    List<V> findAll();
}
