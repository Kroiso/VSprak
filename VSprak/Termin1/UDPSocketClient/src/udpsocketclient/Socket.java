/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpsocketclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author Michi
 */
public class Socket {
    
    private InetAddress receiverAddress;
    
    public Socket(){
        //LocalHost Adresse nehmen
        try {
        receiverAddress = InetAddress.getLocalHost();
        }
        catch (UnknownHostException e) {
            System.exit(0);
        }
    }
    
    public void sendMsg(String message) {
        
        try(DatagramSocket datagramSocket = new DatagramSocket()){
        
        byte[] buffer = message.getBytes();
        
        DatagramPacket packet = new DatagramPacket (buffer, buffer.length, receiverAddress, 4567);
        
        datagramSocket.send(packet);
        }
        catch (SocketException e){
                System.out.print("Could not start UDP socket server");
        }
        catch (IOException e) {
            System.out.print("Could not send Data");
        }
    }
}
