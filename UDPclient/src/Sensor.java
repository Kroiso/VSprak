/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author Michi
 */
public class Sensor {
    
    protected int wert;
    public int typ;
    
    public Sensor(int type, int wert){
        this.wert = wert;
        this.typ = type;
    }

    
    //Zahl zwischen 1 und 40 wird gewählt für die Sensorwerte
    public int sensorWert(){
        Random rnd = new Random();
        int num = (rnd.nextInt(40) +1);
        return num;
    }

    @Override
    public String toString() {
        return "Sensor{" + " typ=" + typ + ", wert=" + wert + '}';
    }

    public void setWert(int zahl){
        wert = zahl;
    }
    public int getWert(){
        return wert;
    }
    
    public int getType(){
        return typ;
    }
}
