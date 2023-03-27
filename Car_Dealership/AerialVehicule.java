package Car_Dealership;

/**
 *
 * @author Alejandro GS
 */
public class AerialVehicule extends Vehicle{
    //-----Properties-----
    private boolean hasPermissionCA;
    private String registrationCertificate;
    private String typeUse;
       
    //-----Constructor-----
    public AerialVehicule() {
        super("N/A", 0, "N/A");
        this.hasPermissionCA = false;
        this.registrationCertificate = "N/A";
        this.typeUse = "N/A";
    }

    public AerialVehicule(boolean hasPermissionCA, String registrationCertificate, String typeUse, String brand, int model, String reference) {
        super(brand, model, reference);
        this.hasPermissionCA = hasPermissionCA;
        this.registrationCertificate = registrationCertificate;
        this.typeUse = typeUse;
    }
        
    //-----Methods-----
    @Override
    public float CalculateFinalPrice(float unitPrice) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String ToString() {
        return "AerialVehicule{\n" + 
                super.ToString() + 
                ",\nHasPermissionCA= " + hasPermissionCA + 
                ",\nRegistrationCertificate= " + registrationCertificate + 
                ",\nTypeUse= " + typeUse + '}';
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
