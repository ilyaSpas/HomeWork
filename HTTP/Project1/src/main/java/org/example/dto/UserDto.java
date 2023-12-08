package org.example.dto;

import lombok.Builder;
import org.example.dao.UserDao;


public class UserDto {
    private String name;
    private String birthday;
    private String email;
    private String password;
    private String role;
    private String male;

    public UserDto(String name, String birthday, String email, String password, String role, String male) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.password = password;
        this.role = role;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getMale() {
        return male;
    }

    @Override
    public String toString() {
        return "UserDto{" +
               "name='" + name + '\'' +
               ", birthday='" + birthday + '\'' +
               ", email='" + email + '\'' +
               ", password='" + password + '\'' +
               ", role='" + role + '\'' +
               ", male='" + male + '\'' +
               '}';
    }
}
