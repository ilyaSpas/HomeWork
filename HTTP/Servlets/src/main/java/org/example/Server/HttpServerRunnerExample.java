package org.example.Server;

public class HttpServerRunnerExample {
    public static void main(String[] args) {
        var server = new HttpServerExample(9000);
        server.run();
    }
}
