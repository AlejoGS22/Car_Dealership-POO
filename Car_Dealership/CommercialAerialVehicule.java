package Car_Dealership;

/**
 *
 * @author Alejandro GS
 */
public class CommercialAerialVehicule extends AerialVehicule {
    //-----Properties-----
    private float discuont;
    
    //-----Constructor-----
    public CommercialAerialVehicule() {
        super();
        this.discuont = 0;
    }

    public CommercialAerialVehicule(float Discuont, boolean hasPermissionCA, String registrationCertificate, String typeUse, String brand, int model, String reference) {
        super(hasPermissionCA, registrationCertificate, typeUse, brand, model, reference);
        this.discuont = Discuont;
    }
    
    //-----Methods-----       
    @Override
    public float CalculateFinalPrice(float unitPrice) {
        float finalPrice = 0;
        
        if(this.model < 2020){
            if(this.model < 2016 ){
                if(this.model < 2010){
                    this.discuont = 0;
                    System.out.println("--------------------------------");
                    System.out.println("Vehículo no apto para la venta");
                    System.out.println("--------------------------------");
                }else{
                    this.discuont = 10;
                }
            }else{
                this.discuont = 5;
            }
        }else{
            this.discuont = 0;
            System.out.println("----------------------");
            System.out.println("Vehículo sin descuento");
            System.out.println("----------------------");
        }
        
        finalPrice = unitPrice * (( 100 - this.discuont ) / 100);
        
        return finalPrice; 
    }

    @Override
    public String ToString() {
        return "CommercialAerialVehicule{\n" +
                super.ToString() + 
                ",\nDiscuont= " + discuont + '}';
    }        
    
    //-----Getters and Setters-----
    public float getDiscuont() {
        return discuont;
    }

    public void setDiscuont(float discuont) {
        this.discuont = discuont;
    }   
}
