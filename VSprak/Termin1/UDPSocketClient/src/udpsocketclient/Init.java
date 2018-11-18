/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpsocketclient;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Michi
 */
public class Init {
    
    public void starten(){
        //Temperatur obj = new Temperatur(1, "temp", 30);
        //Luftfeuchtigkeit obj1 = new Luftfeuchtigkeit(2, "feucht", 20);
        
        ArrayList<Sensor> list = new ArrayList();
        // Erste Variable ist der Typ des Sensors
        // Zweite Variable ist der Wert des Sensors
        list.add(new Temperatur(1, 30));
        list.add(new Luftfeuchtigkeit(2, 20));
        list.add(new DrehzahlBad(3, 10));
        list.add(new Fensterzustand(4, 1));
        
        while(true){
        // Loop um über jeden Sensor zu gehen
       for(int i=0; i < list.size(); i++){
           int neuerWert= list.get(i).sensorWert();
           list.get(i).setWert(neuerWert);
           System.out.print(list.get(i).toString());
           //Daten vom Sensor verschicken
           Socket udpSocketClient = new Socket();
           udpSocketClient.sendMsg(list.get(i).toString());
       }
       // Damit nur alle 5 sec neue Daten generiert
       try {
           TimeUnit.SECONDS.sleep(5);
       }
       catch (InterruptedException ex) {
           System.out.print("Fehler beim iterieren");
           Thread.currentThread().interrupt();
       }
        }
    }
}
