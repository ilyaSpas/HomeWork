package org.example.REQRES;

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class PostForObjectTest {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> jsonToSend = new HashMap<>();
        jsonToSend.put("name","Ivan");
        jsonToSend.put("job","Java developer");

        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonToSend);
        String url = "https://reqres.in//api/users";

        System.out.println(restTemplate.postForObject(url, request, String.class));
    }
}
