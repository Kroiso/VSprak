/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpsocketserver;

/**
 *
 * @author Michi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Create the UDP socket server. */
        Socket udpSocketServer = new Socket();

        // Run the UDP socket server.
        udpSocketServer.run();
    }
    
}
