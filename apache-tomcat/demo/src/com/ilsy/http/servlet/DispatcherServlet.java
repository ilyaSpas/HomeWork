package com.ilsy.http.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet("/dispatcher")
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/flights")
//                .forward(req, resp); передает запрос вперед, URL остается
//                .include(req, resp);  передает запрос вперед, но продолжает работать
        resp.sendRedirect("/flights"); //переходит на другой URL

//        try (PrintWriter writer = resp.getWriter()) {
//            writer.write("Hello world!");
//        }
    }
}
