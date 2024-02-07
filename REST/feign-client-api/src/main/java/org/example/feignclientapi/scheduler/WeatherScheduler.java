package org.example.feignclientapi.scheduler;

import lombok.RequiredArgsConstructor;
import org.example.feignclientapi.properties.WeatherApiProperties;
import org.example.feignclientapi.service.WeatherService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherScheduler {
    private final WeatherService weatherService;
    private final WeatherApiProperties weatherApiProperties;

    @Scheduled(fixedDelay = 960_000)
    public void updateWeather(){
        weatherService.getWeather(weatherApiProperties.getTown());
    }
}
