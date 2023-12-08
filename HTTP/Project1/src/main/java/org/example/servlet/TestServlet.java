package org.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.dto.UserDto;
import org.example.service.UserService;

import java.io.IOException;
import java.util.List;

@WebServlet("/registration")
public class TestServlet extends HttpServlet {
    private final UserService userService = UserService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("roles", List.of("USER", "ADMIN"));
        req.setAttribute("males", List.of("MALE", "FEMALE"));
        req.getRequestDispatcher("WEB-INF/jsp/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDto userDto = new UserDto(req.getParameter("name"), req.getParameter("birthday"),
                req.getParameter("email"), req.getParameter("password"),
                req.getParameter("role"), req.getParameter("male"));
        userService.save(userDto);
        resp.sendRedirect("/");
    }
}
