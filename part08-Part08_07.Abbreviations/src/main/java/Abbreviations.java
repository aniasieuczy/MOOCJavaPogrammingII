
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
public class Abbreviations {
    
    private HashMap <String, String> directory;

    public Abbreviations() {
        this.directory = new HashMap<>();
    }
    
    
    public void addAbbreviation(String abbreviation, String explanation) {
        directory.put(abbreviation, explanation);
        }
    
    public boolean hasAbbreviation(String abbreviation) {
        if(this.directory.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.directory.get(abbreviation);
    }
    
    
}
