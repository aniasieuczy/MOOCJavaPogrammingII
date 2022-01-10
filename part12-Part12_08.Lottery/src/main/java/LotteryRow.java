
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
            this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        numbers = new ArrayList<>();

        while(this.numbers.size() < 7) {
            int randomNumber = random.nextInt(40) + 1;
            if(!this.numbers.contains(randomNumber)) {
                this.numbers.add(randomNumber);  
            } 
        }
    }
      
      
        // Implement the random number generation here
        // the method containsNumber is probably useful
  

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        boolean doubleNumbers = false;
        
        for(int e: numbers) {
        if(e == number) {
            doubleNumbers = true;
        }
        }
        return doubleNumbers;
    }
}

