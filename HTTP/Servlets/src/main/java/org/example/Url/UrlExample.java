package org.example.URL;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    public static void getGoogle() throws IOException {
        URL url = new URL("https://www.google.com");
        URLConnection connection = url.openConnection();

        // GET запрос
        System.out.println(new String(connection.getInputStream().readAllBytes()));
    }

    public static void postGoogle() throws IOException {
        URL url = new URL("https://www.google.com");
        URLConnection connection = url.openConnection();

        // POST запрос
        connection.setDoOutput(true);
        try (OutputStream out = connection.getOutputStream()) {
            out.write("Hello".getBytes());
        }
    }

    public static void readFile() throws IOException {
        URL url = new URL("file:C:\\Users\\Spass\\OneDrive\\Рабочий стол\\" +
                "HW\\HTTP\\Servlets\\src\\main\\java\\org\\example\\UDP\\DatagramServerRunner.java");
        URLConnection connection = url.openConnection();
        System.out.println(new String(connection.getInputStream().readAllBytes()));
    }
}
