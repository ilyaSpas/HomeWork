package org.example.feignclientapi.service;

import lombok.RequiredArgsConstructor;
import org.example.feignclientapi.api_client.WeatherApiClient;
import org.example.feignclientapi.model.Weather;
import org.example.feignclientapi.properties.WeatherApiProperties;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherApiClient weatherApiClient;
    private final WeatherApiProperties weatherApiProperties;
    private final ForecastService forecastService;

    public Weather getWeather(String town) {
        Weather weather = weatherApiClient.getWeather(weatherApiProperties.getKey(),
                town,
                weatherApiProperties.getLang());
        forecastService.save(weather);
        return weather;
    }
}
