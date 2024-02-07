package org.example.feignclientapi.api_client;

import org.example.feignclientapi.model.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "weatherClient", url = "https://api.weatherapi.com/v1/" +
                                           "current.json")
public interface WeatherApiClient {
    @GetMapping
    Weather getWeather(@RequestParam String key,
                       @RequestParam String q,
                       @RequestParam String lang);
}
