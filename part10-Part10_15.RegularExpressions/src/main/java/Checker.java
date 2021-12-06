
import java.util.Scanner;



public class Checker {
    
    private String string;
    
//    public Checker (String string) {
//        this.string = string;
//    }

    public Checker() {
    }
    
    
    
    public boolean isDayOfWeek(String string) {
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")) {
        System.out.println("The form is correct.");
        return true;
        } else {
        System.out.println("The form is incorrect.");
        return false;
        }
    }
    
    public boolean allVowels(String string) {
        if(string.matches("(e|i|o|u|a)+")) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect");
            return false;
        }
    }
    
    public boolean timeOfDay(String string) {
        
        if(string.matches("(?:[01]\\d|2[0-3]):(?:[0-5]\\d):(?:[012345]\\d)")) {
            System.out.println("The form is correct");
            return true;
        } else {
            System.out.println("The form is incorrect");
            return false;
        }
        }

}
