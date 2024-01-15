package com.ilsy.http.servlet;

import com.ilsy.http.util.ConnectionManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.sql.*;

@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setHeader("Content-Disposition", "attachment; filename=\"filename.xlsx\"");
        resp.setContentType("text/plan");
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());

//        try (PrintWriter writer = resp.getWriter()) {
//            writer.write("Hello world!");
//        }

        String sql = """
                SELECT * 
                FROM flight
                """;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id\tCODE\tDate\n");

        try (Connection connection = ConnectionManager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             PrintWriter printWriter = resp.getWriter()) {

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                stringBuilder.append(resultSet.getObject("id", Long.class));
                stringBuilder.append("\t");
                stringBuilder.append(resultSet.getObject("flight_no", String.class));
                stringBuilder.append("\t");
                stringBuilder.append(resultSet.getObject("departure_date", Timestamp.class));
                stringBuilder.append("\n");
            }
            printWriter.write(String.valueOf(stringBuilder));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


//        try (OutputStream outputStream = resp.getOutputStream();
//             InputStream stream = DownloadServlet.class.getClassLoader().getResourceAsStream("test.txt");) {
//            outputStream.write(stream.readAllBytes());
//        }
    }
}
