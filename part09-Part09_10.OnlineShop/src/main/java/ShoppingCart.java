
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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
public class ShoppingCart {
    
    private Map <String, Item> shoppingCartItems;
    
    public ShoppingCart () {  
        this.shoppingCartItems = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if(shoppingCartItems.keySet().contains(product)) {
                increaseQuantity(product); 
        } else { 
        shoppingCartItems.put(product, new Item(product, 1, price));
        }
    }
    
    public void increaseQuantity (String product) {
        shoppingCartItems.get(product).increaseQuantity();
    }
    
    public int price() {
        int totalPrice = 0;
        
        for(Item e: shoppingCartItems.values()) {
           totalPrice = totalPrice + e.price();     
        }
        return totalPrice;
    }  
    
    public void print() {       
        
       int qty = 0;
        for(Item elements: shoppingCartItems.values()) {
            qty = qty + elements.getQty();
                System.out.println(elements );   
        }
  
    }       
}
