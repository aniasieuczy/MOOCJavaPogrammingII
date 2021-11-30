/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public abstract class Animal implements NoiseCapable{
    
 
    private String name;
    
    public Animal (String name) {
        this.name = name;
    }
    
  
    public void eat () {
        System.out.println(this.name + " eats");
    }
    
    public void sleep () {
        System.out.println(this.name + " sleeps");
    }

    public String getName() {
        return name;
    }
    
    @Override
    public void makeNoise () {
        
    }
     
    
}
