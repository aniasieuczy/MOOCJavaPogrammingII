
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
public class Box implements Packable {
    
    private double maximumCapacity;
    private ArrayList <Packable> items;
    
    public Box (double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList <>();
    } 

    public void add (Packable packable){
        if(maximumCapacity < weight() + packable.weight()) {
                return;
        }
                 this.items.add(packable);
            }
    
    public double weight () {
        double weight = 0;
        for(Packable item: items) {
            weight = weight + item.weight();
        }
        return weight;
        }

    @Override
    public String toString () {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }
    
}
    
