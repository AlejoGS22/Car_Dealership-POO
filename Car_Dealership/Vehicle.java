package Car_Dealership;

/**
 *
 * @author Alejandro GS
 */
public abstract class Vehicle {
    //-----Properties-----
    protected String brand;
    protected int model;
    protected String reference;    
    
    //-----Constructor-----
    public Vehicle(String brand, int model, String reference) {
        this.brand = brand;
        this.model = model;
        this.reference = reference;
    }    
    
    //-----Methods-----
    //This method calculate final price the vehicle
    public abstract float CalculateFinalPrice(float unitPrice);
    
    //This method converts the class to string
    public String ToString() {
        return "Brand= " + brand + 
               ",\nModel= " + model + 
               ",\nReference= " + reference;
    }
    
    
    //-----Getters and Setters-----
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }    
}
