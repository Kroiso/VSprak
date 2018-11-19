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
public class Fensterzustand extends Sensor{
    
        public Fensterzustand(int type, int wert){
        super(type, wert);
    }
        @Override 
        public int sensorWert(){
            Random rnd = new Random();
        int num = (rnd.nextInt(2));
        return num;
        }
        
        @Override
        public String toString() {
            return "Fensterzustand:..." + wert + "\n\n";
        }
}
