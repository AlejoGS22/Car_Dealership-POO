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
        this.typeUse = "Comercial";               
    }

    public CommercialAerialVehicule(float Discuont, boolean hasPermissionCA, String registrationCertificate, String typeUse, String brand, int model, String reference, float price) {
        super(hasPermissionCA, registrationCertificate, typeUse, brand, model, reference, price);
        this.discuont = Discuont;
    }
    
    //-----Methods-----       
    @Override
    public float CalculateFinalPrice() {
        float finalPrice = 0;
        
        if(getModel() < 2020){
            if(getModel() < 2016 ){
                if(getModel() < 2010){
                    this.discuont = 0;                                        
                    observation = "Vehículo no apto para la venta";                    
                }else{
                    this.discuont = 10;
                }
            }else{
                this.discuont = 5;
            }
        }else{
            this.discuont = 0;            
            observation = "Vehículo sin descuento";
            
        }
        
        finalPrice = getPrice() * (( 100 - this.discuont ) / 100);
        
        return finalPrice; 
    }

    @Override
    public String ToString() {
        return "CommercialAerialVehicule" +
                "\n---------------------------------------" +
                "\n" + super.ToString() + 
                "\nDiscuont= " + discuont + " %";
    }        
    
    //-----Getters and Setters-----
    public float getDiscuont() {
        return discuont;
    }

    public void setDiscuont(float discuont) {
        this.discuont = discuont;
    }   
}
