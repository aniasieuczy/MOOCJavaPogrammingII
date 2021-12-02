
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(value -> System.out.println(value));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> divisibleByTwo = numbers.stream()
                .filter(value -> value % 2 == 0)
                .collect(Collectors.toCollection(ArrayList:: new));
        
        ArrayList<Integer> divisibleByThree = numbers.stream()
                .filter(value -> value % 3 == 0)
                .collect(Collectors.toCollection(ArrayList:: new));
        
        ArrayList<Integer> divisibleByFive = numbers.stream()
                .filter(value -> value % 5 == 0)
                .collect(Collectors.toCollection(ArrayList:: new));
                 
        ArrayList <Integer> divisibleByTwoThreeFive = new ArrayList<>();
        for(int i = 0; i< divisibleByTwo.size(); i++) {
            divisibleByTwoThreeFive.add(divisibleByTwo.get(i));
        }
        
        for(int i = 0; i< divisibleByThree.size(); i++) {
            divisibleByTwoThreeFive.add(divisibleByThree.get(i));
        }       
        
          for(int i = 0; i< divisibleByFive.size(); i++) {
            divisibleByTwoThreeFive.add(divisibleByFive.get(i));
        }
        
        return divisibleByTwoThreeFive;
    }

}
