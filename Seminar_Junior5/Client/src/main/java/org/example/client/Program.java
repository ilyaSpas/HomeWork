package org.example.client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) throws InterruptedException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите своё имя: ");
            // Укажем свое имя
            String name = scanner.nextLine();
            Socket socket = new Socket("localhost", 1400);
            Client client = new Client(socket, name);
            InetAddress inetAddress = socket.getInetAddress();
            System.out.println("InetAddress: " + inetAddress);
            String remoteIp = inetAddress.getHostAddress();
            System.out.println("Remote IP: " + remoteIp);
            System.out.println("LocalPort:" + socket.getLocalPort());

            client.listenForMessage();
            client.sendMessage();
        }
        catch (UnknownHostException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}