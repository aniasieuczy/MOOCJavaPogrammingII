
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Herd implements Movable{
    
    private List <Movable> listOfOrganisms;
    
    public Herd () {
        this.listOfOrganisms = new ArrayList <>();
    }
    
    public void addToHerd (Movable movable) {
        this.listOfOrganisms.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable e: listOfOrganisms){
            e.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        
        String s = "";
        for(Movable e: this.listOfOrganisms) {
            s = s + e.toString() + "\n";
    }
        return s;
    }
    
}
