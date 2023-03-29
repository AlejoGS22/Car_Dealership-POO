package Car_Dealership;

import java.util.Scanner;

/**
 *
 * @author Alejandro GS
 */
public abstract class Vehicle {
    //-----Properties-----
    private String brand;
    private int model;
    private String reference; 
    private float price;
    
    protected Scanner sc = new Scanner(System.in);
    
    //-----Constructor-----
    public Vehicle(String brand, int model, String reference, float price) {
        this.brand = brand;
        this.model = model;
        this.reference = reference;
        this.price = price;
    }    
    
    //-----Methods-----
    //This method calculate final price the vehicle
    public abstract float CalculateFinalPrice();
    
    //This method converts the class to string
    public String ToString() {
        return "Brand= " + brand + 
               "\nModel= " + model + 
               "\nReference= " + reference;
    }
    
    //This method requests the vehicle information 
    public void requestsInformation(){
        boolean flag = false;
        do{          
            try{
                System.out.println("Ingrese la marca del vehiculo: ");
                this.brand = sc.nextLine();

                System.out.println("Ingrese el modelo del vehiculo: ");
                this.model = sc.nextInt();

                System.out.println("Ingrese la referencia del vehiculo: ");
                this.reference = sc.next().toUpperCase();
                
                System.out.println("Ingrese el precio unitario del vehiculo a vender: ");
                this.price = sc.nextFloat();
                
                flag = true;
            }catch(Exception e){
                System.out.println("----------------------");
                System.err.println("Tipo de dato no valido" );
                System.out.println("----------------------");  
                sc.nextLine();
            }
        }while(flag != true);                
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
