/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Dog extends Animal {
    
 
    public Dog(String name) {
        super(name);   
    }
    
       public Dog () {
        super("Dog");
    }
    
    public void bark () {
        System.out.println(super.getName() + " barks");
    }
    
    /**
     *
     */
    @Override
    public void eat () {
    super.eat();
    }
//    
//    @Override
//    public void sleep () {
//    super.sleep();
//    }
    
    @Override
    public void makeNoise() {
        bark();
    }
    
    @Override
    public String toString () {
       return super.toString();
    }
    
    
}
