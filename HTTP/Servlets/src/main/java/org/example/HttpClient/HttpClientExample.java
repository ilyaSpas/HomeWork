package org.example.HttpClientExample;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;

public class HttpClientExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        HttpRequest request = HttpRequest.newBuilder(URI.create("https://www.google.com"))
                .GET()
                .build();

        HttpRequest request2 = HttpRequest.newBuilder(URI.create("https://www.google.com"))
                .POST(HttpRequest.BodyPublishers.ofFile(Path.of("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\" +
                        "HW\\HTTP\\Servlets\\src\\main\\java\\org\\example\\Main.java")))
                .build();

        HttpResponse response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        HttpResponse response2 = httpClient.send(request2, HttpResponse.BodyHandlers.ofString());

//        System.out.println(response.body());
//        System.out.println(response.headers());

        System.out.println(response2.body());
    }
}
