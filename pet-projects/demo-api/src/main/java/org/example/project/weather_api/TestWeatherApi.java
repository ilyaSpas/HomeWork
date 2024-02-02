package org.example.project.weather_api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

public class TestWeatherApi {
    public static void main(String[] args) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://api.weatherapi.com/v1/current.json?" +
                "key=afd771ae1b8c41eb81b205809241901&q=Москва&lang=ru";

        String weather = restTemplate.getForObject(url, String.class);
        System.out.println(weather);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(weather);

        System.out.println("Погода в городе " +
                jsonNode.get("location").get("name") + " " +
                jsonNode.get("current").get("temp_c") + " градусов.");
    }
}
