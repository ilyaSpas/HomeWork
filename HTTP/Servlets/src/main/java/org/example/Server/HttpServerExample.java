package org.example.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;

public class HttpServerExample {
    private final int port;

    public HttpServerExample(int port) {
        this.port = port;
    }

    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            processSocket(socket);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void processSocket(Socket socket) {
        try (socket;
             InputStream in = new DataInputStream(socket.getInputStream());
             OutputStream out = new DataOutputStream(socket.getOutputStream())) {

            System.out.println("Request: " + new String(in.readNBytes(400)));

            byte[] body = Files.readAllBytes(Path.of("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\" +
                    "HW\\HTTP\\Servlets\\src\\main\\resources\\test.html"));
            String header = """
                    HTTP/1.1 200 OK
                    content-type: text/html
                    content-length: %s
                    """.formatted(body.length);

            out.write(header.getBytes());
            out.write(System.lineSeparator().getBytes());
            out.write(body);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
