package org.example.project.service;

import lombok.RequiredArgsConstructor;
import org.example.project.entity.Request;
import org.example.project.model.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final RequestService requestService;

    public Weather getWeather(String town){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://api.weatherapi.com/v1/current.json?" +
                     "key=afd771ae1b8c41eb81b205809241901&q=" + town + "&lang=ru";
        Weather weather = restTemplate.getForObject(url, Weather.class);
        Request request = Request.builder()
                .town(weather.getLocation().getName())
                .build();
        requestService.save(request);
        return weather;
    }
}
