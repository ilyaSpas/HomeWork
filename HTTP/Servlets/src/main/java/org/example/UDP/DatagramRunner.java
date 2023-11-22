package org.example.UDP;

import java.io.IOException;
import java.net.*;

public class DatagramRunner {
    public static void main(String[] args) throws SocketException, UnknownHostException {

        InetAddress address = InetAddress.getByName("localhost");

        try (DatagramSocket datagramSocket = new DatagramSocket();) {

            byte[] bytes = "Hello world!!!!!!".getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, 7150);
            datagramSocket.send(packet);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
