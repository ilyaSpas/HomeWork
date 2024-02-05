package org.example.service;

import org.example.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> usersFromDB = new ArrayList<>();

    public List<User> getAllUsers(){
        return usersFromDB;
    }

    public void add(User user){
        usersFromDB.add(user);
    }
}
