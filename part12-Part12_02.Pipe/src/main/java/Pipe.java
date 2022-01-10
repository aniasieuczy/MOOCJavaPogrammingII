
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Pipe <T> {
    
    private ArrayList <T> pipes;
    
    public Pipe() {
       this.pipes = new ArrayList <>();
    }
    
    public void putIntoPipe(T value)  {
        this.pipes.add(value); 
    }

    public T takeFromPipe() {
        T previouslyLast = pipes.get(0);
        if(pipes.isEmpty()) {
            return null;
        } else {
            pipes.remove(pipes.get(0));
        return previouslyLast;
        
       }  
        
    }
    
    public boolean isInPipe() {
        if(pipes.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
}