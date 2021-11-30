
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.country = country;
        this.liNumber = liNumber;  
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        
        if(getClass() != obj.getClass()){
            return false;
        }
        
        LicensePlate comparedLicensePlate = (LicensePlate) obj;
        
        if(this.liNumber.equals(comparedLicensePlate.liNumber) &&
           this.country.equals(comparedLicensePlate.country)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.liNumber);
        hash = 71 * hash + Objects.hashCode(this.country);
        return hash;
    }

  

    
    
}
