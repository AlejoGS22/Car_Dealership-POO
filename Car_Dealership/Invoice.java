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
    private static int id;
    private int quantity;
    private double totalPrice;
    private float unitPrice;
    
    private Scanner sc = new Scanner(System.in);
    private Vehicle objMyVehicle;
    private int id2 = 0;
    
    //-----Constructor-----
    public Invoice() {
        this.description = "N/A";
        this.governmentTax = 0;
        this.quantity = 0;
        this.totalPrice = 0;
        this.unitPrice = 0;
        this.id2 = this.id;
        this.id = id2 + 1;
        
        objMyVehicle = null;                
    }

    public Invoice(String description, float governmentTax, int quantity) {
        this.description = description;
        this.governmentTax = governmentTax;
        this.quantity = quantity;
        this.id += 1;
    }        
    
    //-----Methods-----
    public boolean AddVehicule(){        
        int opc = 0;        
        
        do{
            try{                
                System.out.println("-------------------------------------------");
                System.out.println("Seleccione el vehiculo que desea agregar: ");
                System.out.println("-------------------------------------------");
                System.out.println("1. Vehiculos de Propulsion Humana");
                System.out.println("2. Vehiculos Motorizados Terrestres");
                System.out.println("3. Vehiculos Aereos");
                System.out.println("4. Cancelar venta");
                opc = sc.nextInt();

                switch(opc){
                    case 1 -> objMyVehicle = new HumanPoweredVehicule();
                    case 2 -> objMyVehicle = addMotorizedLandVehicle();
                    case 3 -> objMyVehicle = addAerialVehicule();
                    case 4 -> {return false;}
                    default -> {
                        System.out.println("----------------------------");
                        System.err.println("Seleccione una opcion valida");
                        System.out.println("----------------------------");
                    }
                }
            }catch(Exception e){
                System.out.println("----------------------");
                System.err.println("Tipo de dato no valido" );
                System.out.println("----------------------");  
                sc.nextLine();
            }
        }while(opc < 1 || opc > 4);
        
        objMyVehicle.requestsInformation();
        unitPrice = objMyVehicle.CalculateFinalPrice();
        totalPrice = calculateTotalPrice();
        return true;        
    }
            
    @Override
    public void GetTotalAmount() {
        boolean flag = false;
        
        do{            
            try{
                System.out.println("--------------------------------------");
                System.out.println("             Nueva Venta              ");
                System.out.println("--------------------------------------");
                
                System.out.println("Ingrese la descripcion de la factura: ");
                this.description = sc.next();
                
                System.out.println("Ingrese el valor del IVA: ");
                this.governmentTax = sc.nextFloat();                                
                
                System.out.println("Ingrese la cantidad de vehiculos que se van a vender: ");
                this.quantity = sc.nextInt();
                
                flag = true;
            }catch(Exception e){
                System.out.println("----------------------");
                System.err.println("Tipo de dato no valido");
                System.out.println("----------------------");
                sc.nextLine();
            }
            
        }while(flag != true);
        
        AddVehicule(); 
    }

    @Override
    public void GetValueToPay() { 
        int opc = 0;               
        do{ 
            try{
                System.out.println(ToString());                
                System.out.println("1.Salir");
                opc = sc.nextInt();

                if( opc != 1 ){
                    System.out.println("----------------------------");
                    System.err.println("Seleccione una opcion valida");
                    System.out.println("----------------------------");
                }

            }catch(java.util.InputMismatchException e){
                System.out.println("----------------------");
                System.err.println("Tipo de dato no valido");
                System.out.println("----------------------");
                sc.nextLine();
            }  
            catch(NullPointerException e){                    
                System.out.println("--------------------------------");
                System.err.println("Primero debes ingresar una venta");
                System.out.println("--------------------------------");                
                opc = 1;
            } 
        }while( opc != 1 );                                            
    }

    public String ToString() {
        return  "\n---------------------------------------" +
                "\n               Factura                 " + 
                "\n---------------------------------------" +
                "\nId= " + id +
                "\nDescription= " + description +
                "\n---------------------------------------" +
                "\n" + objMyVehicle.ToString() +
                "\n---------------------------------------" +
                "\nUnit Price= $ " + String.format("%.2f", unitPrice) +
                "\nQuantity= " + quantity +   
                "\nGovernmentTax= " + governmentTax + "%" +                              
                "\nTotal Price= $ " + String.format("%.2f", totalPrice) +
                "\n---------------------------------------";
    }   
    
    private float calculateTotalPrice(){
        return (unitPrice * quantity) * ( (100 + governmentTax ) / 100 );
    }
    
    private Vehicle addMotorizedLandVehicle(){
        int opcMT = 0; 
        MotorizedLandVehicle objMLV = null;
        
        do{
            try{
                System.out.println("-------------------------------------------");
                System.out.println("El Vehículo Motorizado Terrestre es: ");
                System.out.println("-------------------------------------------");
                System.out.println("1. Nuevo");
                System.out.println("2. Usado");
                System.out.println("3. Volver");
                opcMT = sc.nextInt();

                switch(opcMT){
                    case 1 -> objMLV = new MotorizedLandVehicle();

                    case 2 -> objMLV = new UsedMotorizedLandVehicle();

                    case 3 -> AddVehicule();

                    default -> {
                        System.out.println("----------------------------");
                        System.err.println("Seleccione una opcion valida");
                        System.out.println("----------------------------");
                    }
                }
            }catch(Exception e){
                System.out.println("----------------------");
                System.err.println("Tipo de dato no valido");
                System.out.println("----------------------");
                sc.nextLine();
            }
        }while( opcMT < 1 || opcMT > 2 );
        
        return objMLV;
    }
    
    private Vehicle addAerialVehicule(){
        int opcAe = 0;
        AerialVehicule objAeV = null;

        do{
            try{
                System.out.println("--------------------------------------------------");
                System.out.println("Seleccione el tipo de uso para el vehiculo aereo: ");
                System.out.println("--------------------------------------------------");
                System.out.println("1. Carga");
                System.out.println("2. Militar");
                System.out.println("3. Comercial");                
                System.out.println("4. Volver");                        
                opcAe = sc.nextInt();

                switch(opcAe){
                    case 1 -> objAeV = new CargoAerialVehicle();

                    case 2 -> objAeV = new MilitaryAerialVehicle();

                    case 3 -> objAeV = new CommercialAerialVehicule();

                    case 4 -> AddVehicule();

                    default -> {
                        System.out.println("----------------------------");
                        System.err.println("Seleccione una opcion valida");
                        System.out.println("----------------------------");
                    }
                }
            }catch(Exception e){
                System.out.println("----------------------");
                System.err.println("Tipo de dato no valido");
                System.out.println("----------------------");
                sc.nextLine();
            }
        }while(opcAe < 1 || opcAe > 4);  
        
        return objAeV;
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
