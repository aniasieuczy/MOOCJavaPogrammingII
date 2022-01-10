
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here

        List <String> listaAni = new List <>();
        listaAni.add("aniadodaje0index");
        listaAni.add("aniadodaje1index");
        
        
        for(int i = 0; i < listaAni.size(); i++) {
          System.out.println(listaAni.value(i)); 
        }

        System.out.println(listaAni.contains("aniadodaje0index"));
        System.out.println(listaAni.contains("aniadodaje2index"));
        
        listaAni.add("aniadodaje2index");
        System.out.println(listaAni.contains("aniadodaje2index"));
        
        listaAni.remove("aniadodaje2index");
        System.out.println(listaAni.contains("aniadodaje2index"));
        
        
        
        
        
    }
}
