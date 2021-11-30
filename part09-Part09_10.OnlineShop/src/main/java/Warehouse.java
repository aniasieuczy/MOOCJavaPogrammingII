
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Warehouse {
    
    private Map <String, Integer> productPrice;
    private Map <String, Integer>productStock;
    
    public Warehouse () {
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);       
    }
    
    public int price(String product) {
        
        for(String elements: productPrice.keySet()) {
            if(elements.equals(product)) {
             productPrice.getOrDefault(product, -99);
            }
        }
    return productPrice.getOrDefault(product, -99);
    }   
    
    
    public int stock(String product){
        for(String element: productStock.keySet()) {
            if(element.equals(product)) {
                productStock.getOrDefault(product, 0);
            }
        }
        return productStock.getOrDefault(product, 0);
    }
    
    
    public boolean take(String product) {
        if(productStock.containsKey(product)){
            for(Integer value: productStock.values()) {
                int stock = productStock.get(product);
                if(stock >0) {
                    stock = stock - 1;
                    productStock.put(product, stock); 
                    return true;
                } else {
                stock = 0;
                productStock.put(product, stock);
                return false;
                }
            }
        }
       return false;
    }
    
    
    public Set<String> products()  {
        Set <String> keys = productStock.keySet();
        return keys;
    
    }
    
}
