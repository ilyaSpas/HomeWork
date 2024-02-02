package org.example.project.controller;

import lombok.RequiredArgsConstructor;
import org.example.project.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping
    public String weatherPage(){
        return "weatherPage";
    }

    @GetMapping("/get")
    public String getWeather(@RequestParam("town")String town, Model model){
        model.addAttribute("weather", weatherService.getWeather(town));
        return "weatherPage";
    }
}
