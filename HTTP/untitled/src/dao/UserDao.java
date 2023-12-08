package dao;

import entity.User;
import utils.ConnectionManager;

import java.sql.*;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class UserDao implements Dao<Integer, User> {
    private static final UserDao INSTANCE = new UserDao();

    private UserDao() {
    }

    private static final String SQL_SAVE = """
            INSERT INTO public.users 
            (name, birthday, email, password, role, gender) 
            VALUES (?, ?, ?, ?, ?, ?)
            """;
    @Override
    public User save(User user) {
        try (Connection connection = ConnectionManager.open();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SAVE, RETURN_GENERATED_KEYS)) {
            preparedStatement.setObject(1, user.getName());
            preparedStatement.setObject(2, user.getBirthday());
            preparedStatement.setObject(3, user.getEmail());
            preparedStatement.setObject(4, user.getPassword());
            preparedStatement.setObject(5, user.getRole());
            preparedStatement.setObject(6, user.getGender());

            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            generatedKeys.next();
            user.setId(generatedKeys.getObject("id", Integer.class));

            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static UserDao getInstance(){
        return INSTANCE;
    }
}
