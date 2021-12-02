
import java.util.ArrayList;
import java.util.Scanner;


public class PrintingUserInput {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <String> userInput = new ArrayList<>();
        
        
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                
            userInput.stream()
            .forEach(value -> System.out.println(value));
            
            break;
            }
            
          userInput.add(input);
        }
    
    }
   
}
