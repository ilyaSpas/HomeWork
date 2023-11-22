package org.example.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServerRunner {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(7150);
             //блокирующий метод
             Socket socket = server.accept();
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             DataInputStream in = new DataInputStream(socket.getInputStream());
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("From client: " + in.readUTF());
                out.writeUTF(scanner.nextLine());
            }
        }
    }
}
