package Server;

import java.io.IOException;
import java.net.*;
import java.util.Date;

public class MainServer {

    public static void main(String[] args) {

        try {
            DatagramSocket dSocket = new DatagramSocket(3000);
            byte[] bufferIn = new byte[256];

            DatagramPacket dpi = new DatagramPacket(bufferIn, bufferIn.length);
            dSocket.receive(dpi);

            System.out.println("Ricezione effettuata");
            String messageIn = new String(dpi.getData(), dpi.getLength());
            InetAddress clientAddress = dpi.getAddress();
            int clientPort=dpi.getPort();

            DatagramPacket dpo = new DatagramPacket(messageIn.getBytes(), messageIn.length(), clientAddress,clientPort);



            System.out.println("SONO IL CLIENT" + clientAddress +":" +clientPort +">" + messageIn);
        } catch (BindException e) {
            System.out.println("porta occupata");

        } catch (SocketException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            System.out.println("errore invio pacchetto");
        }

    }

}