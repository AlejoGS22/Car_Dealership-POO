package Car_Dealership;

/**
 *
 * @author Alejandro GS
 */
public class MilitaryAerialVehicle extends AerialVehicule {
    //-----Properties-----
    private float militaryTax;
    
    //-----Constructor-----
    public MilitaryAerialVehicle() {
        super();
        this.militaryTax = 0;
    }
    
    public MilitaryAerialVehicle(float militaryTax, boolean hasPermissionCA, String registrationCertificate, String typeUse, String brand, int model, String reference) {
        super(hasPermissionCA, registrationCertificate, typeUse, brand, model, reference);
        this.militaryTax = militaryTax;
    }
    
    //-----Methods-----
    @Override
    public float CalculateFinalPrice(float unitPrice) {
        
        float finalPrice = 0;
        
        finalPrice = unitPrice * ((100 + this.militaryTax)/100);
        
        return finalPrice;
    }

    @Override
    public String ToString() {
        return "MilitaryAerialVehicle{\n" + 
                super.ToString() + 
                ",\nmilitaryTax= " + militaryTax + '}';
    }
       
    //-----Getters and Setters-----
    public float getMilitaryTax() {
        return militaryTax;
    }

    public void setMilitaryTax(float militaryTax) {
        this.militaryTax = militaryTax;
    }    
}
