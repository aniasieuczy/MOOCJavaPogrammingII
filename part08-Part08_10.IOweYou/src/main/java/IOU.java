
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class IOU {
    
    private HashMap<String, Double> IOU;

    public IOU() {
        IOU = new HashMap<>();
    }

    
    public void setSum(String toWhom, double amount){
        IOU.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        
        if(this.IOU.containsKey(toWhom)){
          return IOU.get(toWhom);
        }
        return 0;   
    }
    
}
