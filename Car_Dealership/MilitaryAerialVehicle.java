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
        this.typeUse = "Militar";
    }
    
    public MilitaryAerialVehicle(float militaryTax, boolean hasPermissionCA, String registrationCertificate, String typeUse, String brand, int model, String reference, float price) {
        super(hasPermissionCA, registrationCertificate, typeUse, brand, model, reference, price);
        this.militaryTax = militaryTax;
    }
    
    //-----Methods-----
    @Override
    public float CalculateFinalPrice() {
        
        float finalPrice = 0;
        
        finalPrice = this.getPrice() * ((100 + this.militaryTax)/100);
        
        return finalPrice;
    }

    @Override
    public String ToString() {
        return  "MilitaryAerialVehicle" + 
                "\n---------------------------------------" +
                "\n" + super.ToString() + 
                "\nmilitaryTax= " + militaryTax + " %";
    }
       
    @Override
    public void requestsInformation(){
        boolean flag = false;
        
        super.requestsInformation();
        
        do{            
            try{                                
                System.out.println("Ingrese el porcentaje del Impuesto Militar: ");
                this.militaryTax = sc.nextFloat();
                
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
    public float getMilitaryTax() {
        return militaryTax;
    }

    public void setMilitaryTax(float militaryTax) {
        this.militaryTax = militaryTax;
    }    
}
