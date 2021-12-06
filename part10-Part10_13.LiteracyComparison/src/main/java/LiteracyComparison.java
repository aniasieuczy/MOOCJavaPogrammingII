
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        List <Literacy> list = new ArrayList<>();
        
//(String theme, String ageGroup, String gender, String country, int year, double literacyPercent) 
 
        try { 
         Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((x, y) -> x[5].compareTo(y[5]))
                    .filter(parts -> parts.length >= 6)
                    .map(parts -> new Literacy(parts[0], parts[1], parts[2].replace("(%)", "").trim(), parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    .forEach(literacy -> list.add(literacy)); 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Collections.sort(list);
        list.stream().forEach(l -> System.out.println(l));
   
    }  
 
}
