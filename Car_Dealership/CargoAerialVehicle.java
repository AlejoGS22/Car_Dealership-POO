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
        this.typeUse = "Carga";
    }
    
    public CargoAerialVehicle(float capacityKilograms, boolean hasPermissionCA, String registrationCertificate, String typeUse, String brand, int model, String reference, float price) {
        super(hasPermissionCA, registrationCertificate, typeUse, brand, model, reference, price);
        this.capacityKilograms = capacityKilograms;
    }
        
    //-----Methods-----     
    @Override
    public float CalculateFinalPrice() {
        float finalPrice = this.getPrice();
        
        finalPrice += this.capacityKilograms * 5000;
                
        return finalPrice;
    }       

    @Override
    public String ToString() {
        return "CargoAerialVehicle\n" +
                "\n---------------------------------------" +
                "\n" + super.ToString() + 
                "\nCapacityKilograms= " + capacityKilograms + " KG";
    }    

    @Override
    public void requestsInformation(){
        boolean flag = false;
        
        super.requestsInformation();
        
        do{            
            try{
                
                System.out.println("Ingrese la capacidad de carga en Kilogramos del Vehiculo: ");
                this.capacityKilograms = sc.nextFloat();
                
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
    public float getCapacityKilograms() {
        return capacityKilograms;
    }

    public void setCapacityKilograms(float capacityKilograms) {
        this.capacityKilograms = capacityKilograms;
    }    
}
