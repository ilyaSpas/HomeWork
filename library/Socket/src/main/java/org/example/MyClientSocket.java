package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8081);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        Scanner send = new Scanner(System.in);
        while (true){
            System.out.println("Введите сообщение для отправки на сервер:");
            String words = send.nextLine();
            out.println(words);
            out.flush();
            String s = in.nextLine();
            System.out.println("Ответ сервера:\n" + s);
        }

        //out.close();
        //socket.close();
    }
}
