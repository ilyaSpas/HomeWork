package com.ilsy.http.servlet;

import com.ilsy.http.dto.FlightDto;
import com.ilsy.http.service.FlightService;
import com.ilsy.http.util.JspHelper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.toMap;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
    private final FlightService flightService = FlightService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<FlightDto> flightDtos = flightService.findAll();

        req.setAttribute("flights", flightDtos);

//        req.getSession().setAttribute("flightsMap", flightDtos.stream()
//                .collect(toMap(FlightDto::getId, FlightDto::getDescription)));

        req.getRequestDispatcher(JspHelper.getPath("main.jsp"))
                .forward(req, resp);
    }
}
