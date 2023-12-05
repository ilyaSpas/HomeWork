package com.ilsy.http.servlet;

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

@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-Disposition", "attachment; filename=\"filename.txt\"");
        resp.setContentType("text/plan");
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());

//        try (PrintWriter writer = resp.getWriter()) {
//            writer.write("Hello world!");
//        }

        try (OutputStream outputStream = resp.getOutputStream();
             InputStream stream = DownloadServlet.class.getClassLoader().getResourceAsStream("test.txt");) {
            outputStream.write(stream.readAllBytes());
        }
    }
}
