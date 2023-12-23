package org.example.dao;

import org.example.entity.Courses;

public interface Dao<T, K> {
    Courses findById(K k);

    void update(T t);

    void delete(T t);

    void save(T t);
}
