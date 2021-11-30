
import java.util.ArrayList;
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
public class VehicleRegistry {
    
      private HashMap <LicensePlate, String> carOwners;

    public VehicleRegistry() {
        carOwners = new HashMap <> ();
    }
 
    public boolean add(LicensePlate licensePlate, String owner) {
      
        if(this.carOwners.containsKey(licensePlate)){
        return false;
        }
        carOwners.put(licensePlate, owner);
//        ArrayList <String> vehicleRegister = new ArrayList <>();
//        vehicleRegister.add(carOwners.get(licensePlate));
         return true;
        }
   
    public String get(LicensePlate licensePlate) {
     return carOwners.getOrDefault(licensePlate, null);
        }  
    
    public boolean remove(LicensePlate licensePlate) {
        if(this.carOwners.containsKey(licensePlate)) {
        this.carOwners.remove(licensePlate);
        return true;
        }
        return false;
        }
    
    public void printLicensePlates(){
        for(LicensePlate plates: this.carOwners.keySet()) {
            System.out.println(plates);
        }
    }
    
    public void printOwners() {
        
//        this.carOwners.putIfAbsent(LicensePlate licenseplate, t)
        
        
        
        
        ArrayList <String> allOwners = new ArrayList<>();
        for(String owners: this.carOwners.values()) {
            if(!(allOwners.contains(owners))) {
              allOwners.add(owners); 
            }
        }
        for(int i = 0; i < allOwners.size(); i ++) {
            System.out.println(allOwners.get(i));
        }
//        System.out.println(allOwners);
        
    }
    
    
 
}
