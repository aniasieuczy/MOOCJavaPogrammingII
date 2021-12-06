
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList <Integer> values = new ArrayList<>();
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input > 0) {
                values.add(input);
                
            } else {
                values.add(input);
                values.stream()
                .filter(value -> (value >= 1) && (value <= 5))
                .distinct()
                .forEach(value -> System.out.println(value));
                
            break;
            }
        }
    }
}
