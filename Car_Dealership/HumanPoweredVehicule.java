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
        super("N/A", 0, "N/A", 0);
        this.environmetalSubside = 25;
    }

    public HumanPoweredVehicule(float environmetalSubside, String brand, int model, String reference, float price) {
        super(brand, model, reference, price);
        this.environmetalSubside = environmetalSubside;
    }    
    
    //-----Methods-----
    @Override
    public float CalculateFinalPrice(){        
        float finalPrice = getPrice() * (( 100 - this.environmetalSubside ) / 100) ;        
        return finalPrice;
    }

    @Override
    public String ToString() {        
        return  "HumanPoweredVehicule" +
                "\n---------------------------------------" +
                "\n" + super.ToString() + 
                "\nEnvironmetalSubside= " + environmetalSubside + "%";
    }
            
    //-----Getters and Setters-----
    public float getEnvironmetalSubside() {
        return environmetalSubside;
    }

    public void setEnvironmetalSubside(float environmetalSubside) {
        this.environmetalSubside = environmetalSubside;
    }
}
