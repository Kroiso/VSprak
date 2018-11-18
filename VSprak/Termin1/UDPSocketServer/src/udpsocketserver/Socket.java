/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpsocketserver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Arrays;

/**
 *
 * @author Michi
 */
public class Socket {
    
    private byte[] buf;
    private int port = 4567;
    
    
    public Socket() {
        buf = new byte[256];
    }
    
    public void run(){
        try(DatagramSocket datagramSocket = new DatagramSocket(port)){
            
            while (true){
          DatagramPacket packet = new DatagramPacket(buf, buf.length);
          
          datagramSocket.receive(packet);
          
          printMessage(packet);
        }
        }
        catch (SocketException e){
            System.out.print("Could not start the UDP Socket Server");
        }
        catch (IOException e){
            System.out.print("Could not receive packet");
        }
    }
    
    private void printMessage(DatagramPacket packet){
        
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        
        int length = packet.getLength();
        
        byte[] payload = Arrays.copyOfRange(packet.getData(), 0 ,length);
        
        System.out.print("Received: IP:Port: " + address + ":" + port + ", length: " + length + ", payload: " + new String(payload));
    }
    
}
