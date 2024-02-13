package org.example;

import org.springframework.web.client.RestTemplate;

public class Main2 {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://catfact.ninja/facts";
        String response = restTemplate.getForObject(url, String.class);

        System.out.println(response);
    }
}
