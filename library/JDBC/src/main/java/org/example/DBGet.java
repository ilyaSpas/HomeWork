package org.example;

import java.sql.*;

public class DBGet {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","12345");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from persons");

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int age = resultSet.getInt(3);
            System.out.printf("ID:%d %s, %d\n",id,name,age);
        }
    }
}
