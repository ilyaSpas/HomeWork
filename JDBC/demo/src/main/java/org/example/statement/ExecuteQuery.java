package org.example.statement;

import org.example.util.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {
    public static void main(String[] args) throws SQLException {

        String request1 = """
                SELECT * 
                FROM public.user
                """;


        try (Connection connection = ConnectionManager.open();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(request1)) {

            while (resultSet.next()) {
                // System.out.println(resultSet.getObject(1, Long.class)); - Null safe
                System.out.printf("""
                        id: %d - %s
                        """, resultSet.getLong("id"), resultSet.getString("name"));
            }
        }
    }
}
