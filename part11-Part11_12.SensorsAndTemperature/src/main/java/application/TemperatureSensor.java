/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Ania
 */
public class TemperatureSensor implements Sensor {
    

    private boolean sensorIsOn;
    private Map <String, Integer> sensors;
    
    public TemperatureSensor () {
        this.sensors= new HashMap <>();
    }
    
    //    boolean isOn();    // returns true if the sensor is on
//    void setOn();      // sets the sensor on
//    void setOff();     // sets the sensor off
//    int read(); 
    
    @Override
    public boolean isOn() {
        if(sensorIsOn) {
            return true;
        }
       return false; 
    }
    
    @Override
    public void setOn () {   
        
    }
    
    @Override
    public void setOff () {
        
    }
    
    @Override
    public int read () {
        try {
        if(sensorIsOn) {
        int random = new Random().nextInt(61);   
        sensors.put("true", random);
        } 
        }catch (Exception e) {
                System.out.println("IllegalStateException - sensor is off");
        }  
       return sensors.get("true");
 
    } 
}
