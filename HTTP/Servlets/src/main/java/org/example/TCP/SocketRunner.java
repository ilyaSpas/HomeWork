package org.example.TCP;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SocketRunner {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 7150);
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             DataInputStream in = new DataInputStream(socket.getInputStream());
             Scanner scanner = new Scanner(System.in)) {

            while (scanner.hasNext()){
                String message = scanner.nextLine();
                out.writeUTF(message);
                System.out.println("From server: " + in.readUTF());
            }
        }
    }
}
