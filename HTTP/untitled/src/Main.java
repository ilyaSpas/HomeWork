import dao.UserDao;
import entity.Gender;
import entity.Role;
import entity.User;
import utils.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String sql = """
                SELECT * FROM public.user
                """;
        try (Connection connection = ConnectionManager.open();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                System.out.println("id:" + resultSet.getObject(1, Long.class));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}