package org.example.blob_clob;

import org.example.util.ConnectionManager;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.*;

public class BlobRunner {
    public static void main(String[] args) throws SQLException, IOException {
        loadImage();
    }

    public static void loadImage() throws SQLException, IOException {
        String request = """
                SELECT image 
                FROM public.blob 
                WHERE id = 2
                """;
        try (Connection connection = ConnectionManager.open();
        PreparedStatement preparedStatement = connection.prepareStatement(request)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                byte[] data = resultSet.getBytes("image");
                Files.write(Path.of("src/main/resources", "new.jpg"), data, StandardOpenOption.CREATE);
            }
        }
    }

    public static void saveImage() throws IOException, SQLException {
        String request = """
                INSERT INTO public.blob 
                VALUES (2, 'test', ?)
                """;
        try (Connection connection = ConnectionManager.open();
             PreparedStatement preparedStatement = connection.prepareStatement(request)) {

            preparedStatement.setBytes(1, Files.readAllBytes(
                    Path.of( "src/main/resources/22.jpg/22.jpg")));
            preparedStatement.executeUpdate();
        }
    }
}
