package Car_Dealership;

/**
 *
 * @author Alejandro GS
 */
public class UsedMotorizedLandVehicle extends MotorizedLandVehicle {
    //-----Properties-----
    private Float mileAge;
    
    //-----Constructor-----
    public UsedMotorizedLandVehicle() {
        super();
        this.mileAge = null;
    }

    public UsedMotorizedLandVehicle(float mileAge, float carTax, String carType, String plate, String tractionType, String brand, int model, String reference, float price) {
        super(carTax, carType, plate, tractionType, brand, model, reference, price);
        this.mileAge = mileAge;
    }
    
    //-----Methods-----       
    @Override
    public float CalculateFinalPrice() {
        float newUnitPrice = super.CalculateFinalPrice();
        float finalPrice = 0;
        float discountFraction = 0;
        
        if(mileAge < 10000){
            if(mileAge < 5000){
                discountFraction = 1 / 8;
            }else{
                discountFraction = 1 / 4;
            }            
        }else{
            discountFraction = 1 / 2;
        }
        
        finalPrice = newUnitPrice * ((1 - discountFraction));
        
        return finalPrice;
    }
    
    @Override
    public String ToString() {
        return  "UsedMotorizedLandVehicle" +
                "\n---------------------------------------" +
                "\n" + super.ToString() + 
                "\nmileAge= " + mileAge + " KM";
    }
    
    @Override
    public void requestsInformation(){
        boolean flag = false;
        
        super.requestsInformation();
        
        do{            
            try{                
                System.out.println("Ingrese el kilometraje del vehiculo ");
                this.mileAge = sc.nextFloat();
                
                flag = true;
            }catch(Exception e){
                System.out.println("----------------------");
                System.err.println("Tipo de dato no valido");
                System.out.println("----------------------");
                sc.nextLine();
            }
            
        }while(flag != true);
    }

    //-----Getters and Setters-----
    public Float getMileAge() {
        return mileAge;
    }

    public void setMileAge(Float mileAge) {
        this.mileAge = mileAge;
    }  
}
