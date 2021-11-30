
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate date1 = new SimpleDate(1, 1, 2000);
        SimpleDate date2 = new SimpleDate(15, 1, 2000);
        SimpleDate date3 = new SimpleDate(1, 2, 2000);
        SimpleDate date4 = new SimpleDate(1, 1, 2020);
        SimpleDate date5 = new SimpleDate(5, 5, 2005);
        SimpleDate date6 = new SimpleDate(1, 1, 2000);
        
//        System.out.println(date2.hashCode());
//        System.out.println(date1.hashCode());
//        System.out.println(date6.hashCode());
        
        System.out.println(date1.equals(date2));
        System.out.println(date1.equals(date6));
        
    }
}
