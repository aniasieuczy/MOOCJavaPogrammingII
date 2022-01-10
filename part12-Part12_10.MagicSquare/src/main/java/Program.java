
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
//        System.out.println(msFactory.createMagicSquare(5));
        
        MagicSquare square = new MagicSquare(3);
        MagicSquare square1 = new MagicSquare(3);
      
//        square.placeValue(0, 0, 8);
//        square.placeValue(0, 1, 1);
//        square.placeValue(0, 2, 6);
//        square.placeValue(1, 0, 3);
//        square.placeValue(1, 1, 5);
//        square.placeValue(1, 2, 7);
//        square.placeValue(2, 0, 4);
//        square.placeValue(2, 1, 9);
//        square.placeValue(2, 2, 2);
//        
//        System.out.println("");
//        
//        square1.placeValue(0, 0, 1);
//        square1.placeValue(0, 1, 2);
//        square1.placeValue(0, 2, 3);
//        square1.placeValue(1, 0, 4);
//        square1.placeValue(1, 1, 5);
//        square1.placeValue(1, 2, 6);
//        square1.placeValue(2, 0, 7);
//        square1.placeValue(2, 1, 8);
//        square1.placeValue(2, 2, 9);
//        
//        System.out.println(square);
//        System.out.println(square.sumsOfRows());
//        System.out.println(square.sumsOfColumns());
//        
//        
//        System.out.println("");
//        System.out.println(square1);
//        System.out.println(square1.sumsOfRows());
//        System.out.println(square1.sumsOfColumns());
//        System.out.println("");
//        System.out.println(square1.sumsOfDiagonals());
//        System.out.println("");
        
        MagicSquareFactory test = new MagicSquareFactory();
        System.out.println(test.createMagicSquare(7));
        System.out.println(test.createMagicSquare(7).sumsOfColumns());
        System.out.println(test.createMagicSquare(7).sumsOfRows());
        System.out.println(test.createMagicSquare(7).sumsOfDiagonals());
        System.out.println(test.createMagicSquare(7).sumsAreSame());
        
        
        
    }
}
