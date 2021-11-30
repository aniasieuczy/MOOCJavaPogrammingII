
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class DictionaryOfManyTranslations {
    
    private HashMap <String, ArrayList <String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap <>();
    }
    
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation); 
    } 
    
    public ArrayList <String> translate(String word) {
        boolean found = false;
//        
//        if(this.dictionary != null) {
            
             for(String translation: dictionary.keySet()) {
                if(translation.contains(word)) {
                found = true;}
             }
          
                if(found == true) {
                    return  this.dictionary.get(word);
                }
                else {
                    ArrayList <String> empty = new ArrayList<>();
                    return empty;
                }
             
       
        }
//        }      
//        return null;
//    }
    
      
    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
