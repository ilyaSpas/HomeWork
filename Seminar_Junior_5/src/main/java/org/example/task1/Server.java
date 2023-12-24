package org.example.task1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(7150);
        Socket socket = server.accept();

        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        DataInputStream dataInputStream = new DataInputStream(inputStream);
        PrintStream printStream = new PrintStream(outputStream);

        printStream.println("Hello world, from server!");
        System.out.println(dataInputStream.readLine());

        socket.close();
        server.close();
    }
}