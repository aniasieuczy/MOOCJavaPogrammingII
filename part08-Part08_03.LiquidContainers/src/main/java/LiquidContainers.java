
import java.util.Scanner;

public class LiquidContainers {
    
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.print("First: " + firstContainer + "/100");
            System.out.println("");
            System.out.println("Second: " + secondContainer+ "/100");

            String input = scan.nextLine();
             if (input.equals("quit")) {
                break;
            }

            String [] parts = input.split(" ");
            String command = parts [0];
            int amount = Integer.valueOf(parts[1]);
  
            if(command.equals("add")) {
                
                if(amount > 0){
                  firstContainer = firstContainer + amount;  
                }
                if (firstContainer > 100) { 
                    firstContainer = 100;
                }
            }
                
            if(command.equals("move")) {
                    
                    if(firstContainer < 0) {
                        firstContainer = 0;
                        secondContainer = 0;
                    } else if((firstContainer - amount) < 0) {
                        secondContainer = firstContainer;
                        firstContainer = 0;
                    } else if( secondContainer + amount > 100) {
                        secondContainer = 100;
                    } else {
                    secondContainer = secondContainer + amount;
                        firstContainer = firstContainer - secondContainer;
                    }
                    
            }
                    
                if (command.equals("remove")) {
                    if(secondContainer - amount < 0) {
                        secondContainer = 0;
                    } else {
                    secondContainer = secondContainer - amount;
                    }
                }

        }
        
    
   
//         public void addAmount(int amount) {
//            if(firstContainer > 100) {
//               firstContainer = 100;
//            }
//            firstContainer = firstContainer + amount;
//        }


    }
}

