/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Ania
 */
public class StandardSensor implements Sensor {
    
    public int value;
    
    public StandardSensor (int value) {
        this.value = value;
    }
    
    @Override
    public boolean isOn () {
        return true;
    }
//     void setOn();      // sets the sensor on
//    void setOff();     // sets the sensor off
//    int read();
    
    @Override
    public void setOn (){
    }
    
    @Override
    public void setOff () {
        
    }
    
    @Override
        public int read() {
            return this.value;
        }
}
