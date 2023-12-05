package org.example.prepared_statement;

import org.example.util.ConnectionManager;

import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MyPreparedStatement {
    public static void main(String[] args) throws SQLException {

        String request1 = """
                SELECT * 
                FROM public.user  
                WHERE id >= ?
                """;

        try (Connection connection = ConnectionManager.open();
        PreparedStatement preparedStatement = connection.prepareStatement(request1)) {
            preparedStatement.setLong(1, 1);
            //размер блока
            preparedStatement.setFetchSize(10);
            //максимальное время соед-ния
            preparedStatement.setQueryTimeout(10);
            //максимальное количество строк
            preparedStatement.setMaxRows(10);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getObject(1, Long.class));
                System.out.println(resultSet.getString(2));
            }
        }

    }
}