package Car_Dealership;

/**
 *
 * @author Alejandro GS
 */
public class AerialVehicule extends Vehicle{
    //-----Properties-----
    protected boolean hasPermissionCA;
    protected String registrationCertificate;
    protected String typeUse;
    protected String observation;
       
    //-----Constructor-----
    public AerialVehicule() {
        super("N/A", 0, "N/A", 0);
        this.hasPermissionCA = false;
        this.registrationCertificate = "N/A";
        this.typeUse = "N/A";
        this.observation = "";
    }

    public AerialVehicule(boolean hasPermissionCA, String registrationCertificate, String typeUse, String brand, int model, String reference, float price) {
        super(brand, model, reference, price);
        this.hasPermissionCA = hasPermissionCA;
        this.registrationCertificate = registrationCertificate;
        this.typeUse = typeUse;
    }
        
    //-----Methods-----
    @Override
    public float CalculateFinalPrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String ToString() {
        String hasPermission;
        if(hasPermissionCA){
            hasPermission = "Si";
        }else{
            hasPermission = "No";
            observation = "Vehículo no apto para la venta"; 
        }
        
        return  "\n" + super.ToString() + 
                "\nHasPermissionCA= " + hasPermission + 
                "\nRegistrationCertificate= " + registrationCertificate + 
                "\nTypeUse= " + typeUse+
                "\nObservation= " + observation;
    }        
    
    @Override
    public void requestsInformation(){
        boolean flag = false;
        int opcPermCA;
        
        super.requestsInformation();
        
        do{            
            try{
                
                do{
                    System.out.println("El vehiculo tiene permiso de la Aeronáutica Civil?: ");
                    System.out.println("1. Si ");
                    System.out.println("2. No");
                    opcPermCA = sc.nextInt();

                    switch(opcPermCA){
                        case 1:
                            this.hasPermissionCA = true;
                            break;
                        case 2:
                            this.hasPermissionCA = false;
                            break;
                        default:
                            System.out.println("----------------------------");
                            System.err.println("Selecciona una opcion valida");
                            System.out.println("----------------------------");
                            sc.nextLine();
                            break;
                    }                                        
                }while(opcPermCA < 1 || opcPermCA > 2);
                
                System.out.println("Ingrese el Certificado de registro: ");
                this.registrationCertificate = sc.next().toUpperCase();
                
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
    public boolean isHasPermissionCA() {
        return hasPermissionCA;
    }

    public void setHasPermissionCA(boolean hasPermissionCA) {
        this.hasPermissionCA = hasPermissionCA;
    }

    public String getRegistrationCertificate() {
        return registrationCertificate;
    }

    public void setRegistrationCertificate(String registrationCertificate) {
        this.registrationCertificate = registrationCertificate;
    }

    public String getTypeUse() {
        return typeUse;
    }

    public void setTypeUse(String typeUse) {
        this.typeUse = typeUse;
    }    
}
