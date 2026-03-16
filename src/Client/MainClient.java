package Client;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class MainClient {
    public static void main(String[] args) throws SocketException {
        System.out.println("CLIENT: avvio del client!");


        try {
            int port = 3000;
            InetAddress serverAddress = InetAddress.getLocalHost(); //il server
            DatagramSocket dSocket = new DatagramSocket();


            String message = "Ciao";
            DatagramPacket dpo = new DatagramPacket(message.getBytes(), message.length(), serverAddress, port);
            dSocket.send(dpo);

        } catch (UnknownHostException e) {
        System.out.println("Server non trovato");
        } catch (SocketException e) {
            System.out.println("Errore nell'invio del messaggio");
        } catch (IOException e) {

            throw new RuntimeException(e);
        }


    }
}