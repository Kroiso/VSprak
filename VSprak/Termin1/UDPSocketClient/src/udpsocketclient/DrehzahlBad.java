/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpsocketclient;

/**
 *
 * @author Michi
 */
public class DrehzahlBad extends Sensor{
    
        public DrehzahlBad(int type, int wert){
        super(type, wert);
    }
    @Override
    public String toString() {
        return "DrehzahlBad:......" + wert + "rpm\n";
    }
}
