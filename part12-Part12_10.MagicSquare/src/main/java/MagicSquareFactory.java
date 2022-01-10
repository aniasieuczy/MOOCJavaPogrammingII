
import java.util.ArrayList;


public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int row = 0;
        int column = size / 2;
        square.placeValue(row, column, 1);
               
        for(int z = 2; z <= size * size; z++) {
            int potentialRow = row;
            int potentialColumn = column;
            
            row = row - 1;
            column = column + 1;
            
            if(row <0) {
                row = size - 1;
            }
            
            if(column > size - 1) {
                column =0;
            }
            
            if(square.readValue(row, column) != 0) {
                
                  row  = potentialRow + 1;
                  if(row > size) {
                      row = 0;
                  }
                column = potentialColumn;
            }
            square.placeValue(row, column, z);
            
             
        }
        return square;
    }
}   
 
//        if(currentI - 1 < 0) {
//            currentI = size
//        } else {
//        currentI = currentI - 1;
//        }
//        
//        
//        if(currentA + 1 > square.length) {
//            currentA = 0;
//        } else {
//            currentA = currentA + 1;
//        }
//        
//        if(square[currentI][currentA] != 0) {
//            currentI = currentI+2;
//            currentA = currentA-1;
//        }
//        
//        
//        square[currentI][currentA] = z;
//        return square;
//    }


