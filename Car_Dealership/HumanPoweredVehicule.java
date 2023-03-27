package Car_Dealership;

/**
 *
 * @author Alejandro GS
 */
public class HumanPoweredVehicule extends Vehicle{
    //-----Properties-----
    private float environmetalSubside;
        
    //-----Constructor-----
    public HumanPoweredVehicule(){
        super("N/A", 0, "N/A");
        this.environmetalSubside = 0;
    }

    public HumanPoweredVehicule(float environmetalSubside, String brand, int model, String reference) {
        super(brand, model, reference);
        this.environmetalSubside = environmetalSubside;
    }    
    
    //-----Methods-----
    @Override
    public float CalculateFinalPrice(float unitPrice){        
        float finalPrice = unitPrice * (( 100 - this.environmetalSubside ) / 100) ;        
        return finalPrice;
    }

    @Override
    public String ToString() {        
        return "HumanPoweredVehicule{ \n" + 
                super.ToString() + 
                ",\nEnvironmetalSubside= " + environmetalSubside + '}';
    }
            
    //-----Getters and Setters-----
    public float getEnvironmetalSubside() {
        return environmetalSubside;
    }

    public void setEnvironmetalSubside(float environmetalSubside) {
        this.environmetalSubside = environmetalSubside;
    }
}
