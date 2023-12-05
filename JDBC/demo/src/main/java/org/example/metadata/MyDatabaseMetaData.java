package org.example.metadata;

import org.example.util.ConnectionManager;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDatabaseMetaData {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = ConnectionManager.open()) {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet catalogs = metaData.getSchemas();
            while (catalogs.next()){
                System.out.println(catalogs.getString(1));
            }
        }
    }
}
