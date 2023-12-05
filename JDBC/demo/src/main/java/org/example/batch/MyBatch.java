package org.example.batch;

import org.example.util.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MyBatch {
    public static void main(String[] args) throws SQLException {
        String request1 = """
                UPDATE public.user 
                SET name = '111' 
                WHERE id = 1
                                
                """;
        String request2 = """
                UPDATE public.user 
                SET name = '222' 
                WHERE id = 2
                """;

        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionManager.open();
            connection.setAutoCommit(false);

            statement = connection.createStatement();
            //транзацкция(либо все запросы, либо ни одного)
            statement.addBatch(request1);
            statement.addBatch(request2);

            int[] ints = statement.executeBatch();
            System.out.println(ints);

            connection.commit();
        } catch (SQLException e) {
            if(connection != null){
                connection.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            if (connection != null){
                connection.close();
            }
            if (statement != null){
                statement.close();
            }
        }

    }
}