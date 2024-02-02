package org.example.project.service;

import org.example.project.weather.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    public Weather getWeather(String town){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://api.weatherapi.com/v1/current.json?" +
                     "key=afd771ae1b8c41eb81b205809241901&q=" + town + "&lang=ru";
        Weather weather = restTemplate.getForObject(url, Weather.class);
        return weather;
    }
}
