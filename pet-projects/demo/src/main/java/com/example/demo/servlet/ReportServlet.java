package com.example.demo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet("/download")
public class ReportServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setHeader("Content-Disposition", "attachment; filename=\"filename.xlsx\"");
        resp.setContentType("text/plan");
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id\tCODE\tDate\n");

        try (PrintWriter writer = resp.getWriter()) {
            writer.write(String.valueOf(stringBuilder));
        }
    }
}
