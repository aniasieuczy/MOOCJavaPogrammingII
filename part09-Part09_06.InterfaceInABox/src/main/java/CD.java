/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class CD implements Packable {
    
    private String artist;
    private String nameOfCD;
    private int publicationYear;
    private double weightOfCD;

    public CD(String artist, String nameOfCD, int publicationYear) {
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.publicationYear = publicationYear;
        this.weightOfCD = 0.1;
    }
    
    @Override
    public String toString () {
        return this.artist + ": " + this.nameOfCD + " (" + this.publicationYear + ")";
    }
    
    @Override
    public double weight () {
        return this.weightOfCD;
    }    
    
}
