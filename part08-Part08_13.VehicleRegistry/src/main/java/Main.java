
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);
        finnishPlates.add(li3);

        
        VehicleRegistry vehicle = new VehicleRegistry();
        
        vehicle.add(new LicensePlate("PL", "WAW-123"), "Ania");
        vehicle.add(new LicensePlate("PL", "WAW-666"), "Tymon");
        vehicle.add(new LicensePlate("PL", "WAW-412"), "Tymon");
        vehicle.add((li1), "Nikos");
        
        vehicle.printLicensePlates();
        
        vehicle.remove(li1);
        vehicle.printLicensePlates();
        
        vehicle.printOwners();
    }
}
