package org.example.weather_api;

import org.example.weather_api.weather.Weather;
import org.springframework.web.client.RestTemplate;

public class Test1WeatherApi {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://api.weatherapi.com/v1/current.json?" +
                "key=afd771ae1b8c41eb81b205809241901&q=Moscow?lang=ru";

        Weather weather = restTemplate.getForObject(url, Weather.class);
        System.out.println(weather.getLocation().getName());
    }
}
