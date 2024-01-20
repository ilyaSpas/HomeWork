package org.example.REQRES;

import org.springframework.web.client.RestTemplate;

public class GetForObjectTest {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://reqres.in/api/users/2";

        String JSON = restTemplate.getForObject(url, String.class);
        System.out.println(JSON);
    }
}
