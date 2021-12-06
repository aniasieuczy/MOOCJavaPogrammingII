/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Literacy implements Comparable <Literacy> {
   // "theme, age group, gender, country, year, literacy percent.
    
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;

    public Literacy(String theme, String ageGroup, String gender, String country, int year, double literacyPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public String getTheme() {
        return theme;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getGender() {
        if(this.gender.equals("female (%)")) {
            return "female";
        } else {
        return "male";
        }
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), "+ this.gender + ", " + this.literacyPercent; 
    }
    
    @Override
    public int compareTo (Literacy literacy) {
        if(this.getLiteracyPercent() == literacy.getLiteracyPercent()) {
            return 0;
        } else if(this.getLiteracyPercent() > literacy.getLiteracyPercent()) {
            return 1;
        } else {
            return -1;
        }
    }
    
    
}
