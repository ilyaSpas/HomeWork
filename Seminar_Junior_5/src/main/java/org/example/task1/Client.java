package org.example.task1;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getLocalHost();
        Socket client = new Socket(address, 7150);

        System.out.println(client.getInetAddress());
        System.out.println(client.getLocalPort());

        InputStream inputStream = client.getInputStream();
        OutputStream outputStream = client.getOutputStream();

        DataInputStream dataInputStream = new DataInputStream(inputStream);
        PrintStream printStream = new PrintStream(outputStream);

        printStream.println("Hello world, from client!");
        System.out.println(dataInputStream.readLine());

        client.close();
    }
}
