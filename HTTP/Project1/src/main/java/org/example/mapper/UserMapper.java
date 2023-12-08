package org.example.mapper;

import org.example.dto.UserDto;
import org.example.entity.User;

public class UserMapper implements Mapper<UserDto, User> {
    private static final UserMapper INSTANCE = new UserMapper();

    private UserMapper() {
    }

    @Override
    public User mapFrom(UserDto object) {
        return new User(Integer.parseInt(object.getId()), object.getName());
    }

    public static UserMapper getInstance(){
        return INSTANCE;
    }
}
