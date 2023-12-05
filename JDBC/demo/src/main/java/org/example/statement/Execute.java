package org.example.statement;

import org.example.util.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute {
    public static void main(String[] args) throws SQLException {

        String request1 = """
                CREATE 
                DATABASE test;
                """;

        String request2 = """
                DROP 
                DATABASE test;
                """;

        String request3 = """
                INSERT INTO public."user" 
                VALUES ('4','Test4'),('5','Test5');
                """;


        try (Connection connection = ConnectionManager.open();
             Statement statement = connection.createStatement()) {

            boolean executeResult = statement.execute(request3);
            System.out.println(executeResult);
        }
    }
}
