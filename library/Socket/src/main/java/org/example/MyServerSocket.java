package org.example;

import javax.crypto.spec.PSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServerSocket {
    public static void main(String[] args) throws IOException {
        // 65536 - кол-во портов
        ServerSocket serverSocket = new ServerSocket(8081);
        Socket input = serverSocket.accept();

        Scanner in = new Scanner(input.getInputStream());
        PrintWriter out = new PrintWriter(input.getOutputStream());
        Scanner send = new Scanner(System.in);

        while (in.hasNext()){
            System.out.println("Входящее сообщение от клиента: ");
            System.out.println(in.nextLine());
            System.out.println("Введите ответ: ");
            String message = send.nextLine();
            out.println(message);
            out.flush();
        }

        out.close();
        in.close();
        input.close();
        serverSocket.close();
    }
}
