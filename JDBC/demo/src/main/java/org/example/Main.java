package org.example;

import org.example.entity.User;
import org.example.service.UserService;
import org.example.util.ConnectionManager;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService service = new UserService();
        //service.save(new User(10, "ILYA"));
        //List<User> list = service.findAll();
        //System.out.println(list);
        //Optional<User> user = service.findById(3L);
        //System.out.println(user);
        //User user3 = new User(3, "XXX");
        //service.update(user3);
        //User user = new User(5, "TEST");
        //UserService.delete(user);
        service.save(new User(5, "ALERT"));
    }
}
