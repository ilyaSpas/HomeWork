package org.example.dao;

import org.example.entity.User;
import org.example.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao implements Dao<Integer, User> {
    public static final UserDao INSTANCE = new UserDao();
    private static final String SQL_SAVE = """
            INSERT INTO public.user (name, birthday, email, password, role, male)
            VALUES (?, ?, ?, ?, ?, ?)
            """;

    private UserDao() {
    }

    public static UserDao getInstance(){
        return INSTANCE;
    }

    @Override
    public void save(User object) {
        try (Connection connection = ConnectionManager.open();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SAVE)) {
            preparedStatement.setObject(1, object.getName());
            preparedStatement.setObject(2, object.getBirthday());
            preparedStatement.setObject(3, object.getEmail());
            preparedStatement.setObject(4, object.getPassword());
            preparedStatement.setObject(5, object.getRole().toString());
            preparedStatement.setObject(6, object.getMale().toString());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
