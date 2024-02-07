package org.example.feignclientapi.controller;

import lombok.RequiredArgsConstructor;
import org.example.feignclientapi.model.Weather;
import org.example.feignclientapi.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping
    public ResponseEntity<Weather> getWeather(@RequestParam(value = "town", required = false)
                                              String town) {
        return new ResponseEntity<>(weatherService.getWeather(town), HttpStatus.OK);
    }
}
