package com.example.demo.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;

import com.example.demo.model.Participant;
import com.example.demo.service.ParticipantService;
import com.example.demo.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ReportDownloadController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/event/{id}/download")
    public synchronized void downloadFile(HttpServletResponse response,
                                          @PathVariable("id") Long id) {
        String report = reportService.getReportById(id);
        try(OutputStream outputStream = response.getOutputStream()) {
            response.setContentType("text/plain");
            response.setHeader("Content-Disposition", "attachment; filename=TEST.xlsx");
            outputStream.write(report.getBytes(Charset.forName("UTF-8")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
