package Client;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class MainClient {
    public static void main(String[] args) throws SocketException {
        System.out.println("CLIENT: avvio del client!");


        try {
            int port = 3000;
            InetAddress serverAddress = InetAddress.getLocalHost();
            DatagramSocket dSocket = new DatagramSocket();


            String message = "Ciao";
            DatagramPacket dpo = new DatagramPacket(message.getBytes(), message.length(), serverAddress, port);
            dSocket.send(dpo);

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
        DatagramPacket outPacket = new DatagramPacket(message.getBytes());
        dSocket.send(outPacket);

    }
}