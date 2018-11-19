/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michi
 */
public class Temperatur extends Sensor{

    Temperatur(int type, int temp){
        super(type, temp);
     }
    
    @Override
    public String toString() {
        return "Temperatur:......." + wert + "°C\n";
    }
}