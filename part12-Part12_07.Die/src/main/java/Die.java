
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces + 1;
        // Initialize the value of numberOfFaces here
    }

    public int throwDie() {
        // generate a random number which may be any number
        // between one and the number of faces, and then return it
        int randomNumber = random.nextInt(numberOfFaces);
        if(randomNumber > this.numberOfFaces) {
            return numberOfFaces;
        } else if (randomNumber == 0) {
            randomNumber ++;
        }
        return randomNumber;

    }
}
