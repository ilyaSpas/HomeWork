package org.example.service;

import org.example.dao.UserDao;
import org.example.entity.User;

import java.util.List;
import java.util.Optional;

public class UserService {
    private static final UserDao userDao = UserDao.getInstance();

    public static void delete(User user) {
        userDao.delete(user.getId());
    }

    public void save(User user){
        userDao.create(user);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public Optional<User> findById(Long id) {
        return userDao.read(id);
    }

    public void update(User user) {
        userDao.update(user);
    }
}
