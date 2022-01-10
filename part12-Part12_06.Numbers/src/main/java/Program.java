
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        int count = Integer.valueOf(scanner.nextLine());
        
        Random randoms = new Random();
        
        for(int i = 0; i < count; i++) {
            int randomNumber = randoms.nextInt(11);
            System.out.println(randomNumber);
        }
    }

}
