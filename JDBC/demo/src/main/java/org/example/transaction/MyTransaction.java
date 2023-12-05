package org.example.transaction;

import org.example.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyTransaction {
    public static void main(String[] args) throws SQLException {

        String request1 = """
                INSERT INTO public."user" 
                VALUES ('6','Test7'),('7','Test7');
                """;
        String request2 = """
                INSERT INTO public."user" 
                VALUES ('8','Test8'),('9','Test9');
                """;

        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;

        try {
            connection = ConnectionManager.open();
            preparedStatement1 = connection.prepareStatement(request1);
            preparedStatement2 = connection.prepareStatement(request2);

            connection.setAutoCommit(false);
            preparedStatement1.executeUpdate();
            if (true){
                throw new RuntimeException("Ooooops!");
            }
            preparedStatement2.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            if (connection != null) {
                connection.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            if (connection != null){
                connection.close();
            }
            if (preparedStatement1 != null){
                preparedStatement1.close();
            }
            if (preparedStatement2 != null){
                preparedStatement2.close();
            }
        }
    }
}
