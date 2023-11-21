package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSet {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db",
                "root","12345");
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO persons (id, name, age) VALUES(2, \"Dasha\", 25)");
    }
}
