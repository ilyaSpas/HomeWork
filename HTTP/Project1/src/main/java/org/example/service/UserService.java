package org.example.service;

import org.example.dao.UserDao;
import org.example.dto.UserDto;
import org.example.entity.User;
import org.example.mapper.UserMapper;

public class UserService {
    private static final UserService INSTANCE = new UserService();

    private final UserDao userDao = UserDao.getInstance();
    private final UserMapper userMapper = UserMapper.getInstance();

    private UserService() {
    }

    public void save(UserDto userDto){
        User user = userMapper.mapFrom(userDto);
        userDao.save(user);
    }

    public static UserService getInstance() {
        return INSTANCE;
    }
}
