
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        
        Pair <String, Integer> pairs = new Pair<>("one", 1);
        System.out.println(pairs.getKey() + " " + pairs.getValue());
        
        HashMap hashmap = new HashMap<>();
        hashmap.add("two", 2);
        
        System.out.println(hashmap.get("two"));
        

    }

}
