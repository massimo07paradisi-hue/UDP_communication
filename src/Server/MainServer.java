package Server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;

public class MainServer {

    public static void main(String[] args) {

        try {
            DatagramSocket dSocket = new DatagramSocket(3000);
            byte[] bufferIn = new byte[256];

            DatagramPacket inPacket = new DatagramPacket(bufferIn, bufferIn.length);
            dSocket.receive(inPacket);

            InetAddress clientAddress = inPacket.getAddress();
            int clientPort=inPacket.getPort();
             String messageIn = new String(inPacket.getData());

             System.out.println("SONO IL CLIENT" + clientAddress +":" +clientPort +">" + messageIn);

            Date d=new Date();

             messageOut
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}