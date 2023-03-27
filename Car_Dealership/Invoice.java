package Car_Dealership;

import java.util.Scanner;
        
/**
 *
 * @author Alejandro GS
 */
public class Invoice implements IInvoice {    
    //-----Properties-----
    private String description;
    private float governmentTax;
    private static int id = 0;
    private int quantity;
    private double totalPrice;
    private double unitPrice;
    
    //-----Constructor-----
    public Invoice() {
        this.description = "N/A";
        this.governmentTax = 0;
        this.quantity = 0;
        this.totalPrice = 0;
        this.unitPrice = 0;
        this.id += 1;
    }

    public Invoice(String description, float governmentTax, int quantity) {
        this.description = description;
        this.governmentTax = governmentTax;
        this.quantity = quantity;
        this.id += 1;
    }        
    
    //-----Methods-----
    public void AddVehicule(){
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        
        System.out.println("-------------------------------------------");
        System.out.println("Seleccione el vehiculo que desea agregar: ");
        System.out.println("-------------------------------------------");
        System.out.println("1. Vehículos de Propulsión Humana");
        System.out.println("2. Vehículos Motorizados Terrestres");
        System.out.println("3. Vehículos Aéreos");
        opc = sc.nextInt();
        
        switch(opc){
            case 1:
                
                break;
            case 2:
                System.out.println("-------------------------------------------");
                System.out.println("El Vehículos Motorizados Terrestres es: ");
                System.out.println("-------------------------------------------");
                System.out.println("1. Nuevo");
                System.out.println("2. Usado");
                System.out.println("3. Salir");
                
                
                break;
            case 3:
                
                break;
                
            default:
                break;
        }
    }
            
    @Override
    public double GetTotalAmount() {
        return this.totalPrice * this.quantity;
    }

    @Override
    public double GetValueToPay() {
        return this.GetTotalAmount() * ( this.governmentTax / 100 );
    }
    
    public String ToString(){
        return "";
    }
    
    //-----Getters and Setters-----
    public double getTotalPrice() {
        return totalPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public static int getId() {
        return id;
    }    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getGovernmentTax() {
        return governmentTax;
    }

    public void setGovernmentTax(float governmentTax) {
        this.governmentTax = governmentTax;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }        
}
