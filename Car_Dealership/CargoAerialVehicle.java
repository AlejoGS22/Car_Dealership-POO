package Car_Dealership;

/**
 *
 * @author Alejandro GS
 */
public class CargoAerialVehicle extends AerialVehicule{
    //-----Properties-----
    private float capacityKilograms;
    
    //-----Constructor-----
    public CargoAerialVehicle() {
        super();
        this.capacityKilograms = 0;
    }
    
    public CargoAerialVehicle(float capacityKilograms, boolean hasPermissionCA, String registrationCertificate, String typeUse, String brand, int model, String reference) {
        super(hasPermissionCA, registrationCertificate, typeUse, brand, model, reference);
        this.capacityKilograms = capacityKilograms;
    }
        
    //-----Methods-----     
    @Override
    public float CalculateFinalPrice(float unitPrice) {
        float finalPrice = unitPrice;
        
        finalPrice += this.capacityKilograms * 5000;
                
        return finalPrice;
    }       

    @Override
    public String ToString() {
        return "CargoAerialVehicle{\n" + 
                super.ToString() + 
                ",\nCapacityKilograms=" + capacityKilograms + '}';
    }        
    
    //-----Getters and Setters-----
    public float getCapacityKilograms() {
        return capacityKilograms;
    }

    public void setCapacityKilograms(float capacityKilograms) {
        this.capacityKilograms = capacityKilograms;
    }    
}
