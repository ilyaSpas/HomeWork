package org.example.mapper;

import org.example.dto.UserDto;
import org.example.entity.Male;
import org.example.entity.Role;
import org.example.entity.User;
import org.example.util.LocalDateFormatter;

public class UserMapper implements Mapper<UserDto, User> {
    private static final UserMapper INSTANCE = new UserMapper();

    private UserMapper() {
    }

    @Override
    public User mapFrom(UserDto object) {
        return new User(object.getName(), LocalDateFormatter.format(object.getBirthday()), object.getEmail(),
                object.getPassword(), Role.valueOf(object.getRole()), Male.valueOf(object.getMale()));
    }

    public static UserMapper getInstance(){
        return INSTANCE;
    }
}
