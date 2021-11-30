
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        List <String> numbers = new ArrayList <>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true) {
            String row = scanner.nextLine();
            
            if(row.equals("end")) {
                break;
            }
            numbers.add(row);
        }
            
            System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
            String input = scanner.nextLine();
            
            if(input.equals("n")) {
               double negativeNumbers = numbers.stream()
                        .mapToDouble(s -> Double.valueOf(s))
                        .filter(number -> number < 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average of the negative numbers: " + negativeNumbers);
            
        } else if (input.equals("p")) {
              double positiveNumbers = numbers.stream()
                        .mapToDouble(s -> Double.valueOf(s))
                        .filter(number -> number > 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average of the negative numbers: " + positiveNumbers);
        }

    }
}
