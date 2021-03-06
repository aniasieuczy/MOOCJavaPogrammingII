/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class List <Type> {
    
    private Type[] values;
    private int firstFreeIndex;
    
    public List () {
        this.values = (Type[]) new Object [10];
        this.firstFreeIndex =0;
        
    }
    
    public void add (Type value) {
        this.values[firstFreeIndex] = value;
        this.firstFreeIndex++;
    }
    
    private void grow () {
        int newSize = this.values.length + this.values.length / 2;
        Type [] newValues = (Type[]) new Object [newSize];
        for(int i = 0; i < this.values.length; i ++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }
    
    public boolean contains (Type value) {
        for(int i = 0; i < this.firstFreeIndex; i ++) {
            if(this.values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
    
    public void remove (Type value) {
        boolean found = false;
        for(int i = 0; i < this.firstFreeIndex; i++) {
            if(found) {
                this.values[i - 1] = this.values[i];
            } else if(value == this.values[i] || this.values[i].equals(value)) {
                this.firstFreeIndex--;
                found = true;
            }
        }
    }
    
    public Type value (int index) {
        if(index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, ] " 
                    + this.firstFreeIndex + "]");
        }
        return this.value(index);
    }
    
    
    
    
    public int indexOfValue (Type value) {
        for(int i = 0; i < this.firstFreeIndex; i ++) {
            if(this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    
    public int size () {
        return this.firstFreeIndex;
    }
    
}
