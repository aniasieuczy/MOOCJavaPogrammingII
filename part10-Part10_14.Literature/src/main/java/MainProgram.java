
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        List <Book> books = new ArrayList<>();
        
        while(true) {
       
        System.out.println("Input the name of the book, empty stops: ");
        String name = scanner.nextLine();
        
        if(name.isEmpty()) {
            break;
        }
        
        System.out.println("Input the age recommendation: ");
        int age = Integer.valueOf(scanner.nextLine());
        books.add(new Book(name, age));
        }
        
        System.out.println(books.size() + " books in total");
        System.out.println("");
        System.out.println("Books: ");
        
//        books.stream()
//                .forEach(book -> System.out.println(book));
        
        for(Book e: books) {
            System.out.println(e);
        }
        
        Comparator <Book> comparator = Comparator
                .comparing(Book::getRecomendedAge)
                .thenComparing(Book::getTitle);
        
        Collections.sort(books, comparator);
        
        System.out.println("");
        for(Book e: books) {
            System.out.println(e);
        }
    }
}
