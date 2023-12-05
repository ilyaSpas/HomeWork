package org.example.statement;

import org.example.util.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate {
    public static void main(String[] args) throws SQLException {
        String request1 = """
                UPDATE public."user" 
                SET name= 'ARMAN'
                WHERE id=4;
                """;

        try (Connection connection = ConnectionManager.open();
             Statement statement = connection.createStatement()) {

            int executeResult = statement.executeUpdate(request1);
            System.out.println(executeResult);
        }
    }
}
