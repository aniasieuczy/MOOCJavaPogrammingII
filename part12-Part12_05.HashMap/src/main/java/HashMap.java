
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
 * @param <K>
 * @param <V>
 */
public class HashMap <K, V> {
    
    private ArrayList <Pair<K, V>>  [] values;
    private int firstFreeIndex;
    
    public HashMap () {
        this.values = new ArrayList [32];
        this.firstFreeIndex = 0;
    }
    
    public V get (K key) {
        int hashValue;
        hashValue = key.hashCode() % this.values.length;
        if(this.values[hashValue] == null) {
            return null;
        }
        
        ArrayList <Pair<K, V>> valuesAtIndex = this.values[hashValue];
        for(int i = 0; i < valuesAtIndex.size(); i++) {
            if(valuesAtIndex.get(i).getKey().equals(key)){
             return valuesAtIndex.get(i).getValue();   
        }
    }
        return null;
    }
    
    
    public void add (K key, V value) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if(values[hashValue] == null) {
            values[hashValue] = new ArrayList <>();
        }
        
        List <Pair<K, V>> valuesAtIndex = values [hashValue];
        
        int index = -1;
        for(int i = 0; i < valuesAtIndex.size(); i ++){
            if(valuesAtIndex.get(i).getKey().equals(key)) {
                index = 0;
                break;
            }
        }
        
        if(index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
    }
    
    
    
    
}
