/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Book {
    
    private String title;
    private int recommendedAge;

    public Book(String title, int recommendedAge) {
        this.title = title;
        this.recommendedAge = recommendedAge;
    }

    public String getTitle() {
        return title;
    }

    public int getRecomendedAge() {
        return recommendedAge;
    }
    
    @Override
    public String toString () {
        return this.title + " (recommended for " + this.recommendedAge + " year-olds or older)";
    }
    
}
