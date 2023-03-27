package Car_Dealership;

/**
 *
 * @author Alejandro GS
 */
public class MotorizedLandVehicle extends Vehicle{
    //-----Properties-----
    private float carTax;
    private String carType;
    private String plate;
    private String tractionType;    
    
    //-----Constructor-----
    public MotorizedLandVehicle() {
        super("N/A", 0, "N/A");
        this.carTax = 0;
        this.carType = "N/A";
        this.plate = "N/A";
        this.tractionType = "N/A";
    }

    public MotorizedLandVehicle(float carTax, String carType, String plate, String tractionType, String brand, int model, String reference) {
        super(brand, model, reference);
        this.carTax = carTax;
        this.carType = carType;
        this.plate = plate;
        this.tractionType = tractionType;
    }
        
    //-----Methods-----
    @Override
    public float CalculateFinalPrice(float unitPrice) {
        float finalPrice = 0;
        float percentCarType = 0;
        
        switch(this.carType.toLowerCase()){
            case "suv":
                percentCarType = 20;
                break;
            
            case "pickup":
                percentCarType = 30;
                break;
                
            default:
                break;
        }               
       
        finalPrice = unitPrice * ( ( 100 + percentCarType + this.carTax ) / 100);
        
        return finalPrice;
    }

    @Override
    public String ToString() {
        return "MotorizedLandVehicle{\n" + 
                super.ToString() +
                ",\ncarTax= " + carTax + 
                ",\ncarType= " + carType + 
                ",\nplate= " + plate + 
                ",\ntractionType= " + tractionType + '}';
    }
    
    //-----Getters and Setters-----
    public float getCarTax() {
        return carTax;
    }

    public void setCarTax(float carTax) {
        this.carTax = carTax;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getTractionType() {
        return tractionType;
    }

    public void setTractionType(String tractionType) {
        this.tractionType = tractionType;
    }
    
}
