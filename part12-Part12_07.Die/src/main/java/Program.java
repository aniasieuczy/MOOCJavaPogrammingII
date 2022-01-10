
public class Program {

    public static void main(String[] args) {
        // main program
        Die die = new Die(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(die.throwDie());
        }
        
        System.out.println();
        Die test = new Die (7);
        
        for(int i = 0; i < 3; i++) {
            System.out.println(test.throwDie());
            
    }
    }
}

