package org.example.Server;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;

public class HttpClientRunnerExample {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:9000"))
                .header("conten-type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofFile(Path.of("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\" +
                        "HW\\HTTP\\Servlets\\src\\main\\resources\\first.json")))
                .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.headers());
        System.out.println(response.body());
    }
}
