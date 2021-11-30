/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Book implements Packable {
    
    private String author;
    private String nameOfTheBook;
    private double weightOfBook;

    public Book(String author, String nameOfTheBook, double weightOfBook) {
        this.author = author;
        this.nameOfTheBook = nameOfTheBook;
        this.weightOfBook = weightOfBook;
    }
    
    @Override
    public String toString () {
        return this.author + ": " + this.nameOfTheBook;
    }
    
    @Override
    public double weight() {
        return this.weightOfBook;
    }  
    
}
