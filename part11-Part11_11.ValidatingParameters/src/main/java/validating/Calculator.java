package validating;

public class Calculator {

    public int factorial(int num) throws IllegalArgumentException {
 
        if(num < 0) {
           throw new IllegalArgumentException ("Parameter must be 0 or greater");
        }   
        int answer = 1;
        for (int i = 1; i <= num; i++) {
        answer *= i;
        
        }
        return answer;
    } 
        
  
    public int binomialCoefficent(int setSize, int subsetSize) throws IllegalArgumentException {

        if (setSize < 0) {
            throw new IllegalArgumentException("When calculating the binomial coefficent the size of the set should be 0 or bigger.");
        }
 
        if (subsetSize < 0) {
            throw new IllegalArgumentException("When calculating the binomial coefficent the size of the subset should be 0 or bigger.");
        }
 
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("When calculating the binomial coefficent the size of the set should be bigger than the subset");
        }
   
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
