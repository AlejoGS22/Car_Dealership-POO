package Car_Dealership;

/**
 *
 * @author Alejandro GS
 */
public class MotorizedLandVehicle extends Vehicle{
    //-----Properties-----
    private float carTax;
    private String carType;
    private String plate;
    private String tractionType;    
    
    //-----Constructor-----
    public MotorizedLandVehicle() {
        super("N/A", 0, "N/A", 0);
        this.carTax = 0;
        this.carType = "N/A";
        this.plate = "N/A";
        this.tractionType = "N/A";
    }

    public MotorizedLandVehicle(float carTax, String carType, String plate, String tractionType, String brand, int model, String reference, float price) {
        super(brand, model, reference, price);
        this.carTax = carTax;
        this.carType = carType;
        this.plate = plate;
        this.tractionType = tractionType;
    }
        
    //-----Methods-----
    @Override
    public float CalculateFinalPrice() {
        float finalPrice = 0;
        float percentCarType = 0;
        
        switch(this.carType.toLowerCase()){
            case "suv":
                percentCarType = 20;
                break;
            
            case "pickup":
                percentCarType = 30;
                break;
                
            default:
                break;
        }               
       
        finalPrice = this.getPrice() * ( ( 100 + percentCarType + this.carTax ) / 100);
        
        return finalPrice;
    }

    @Override
    public String ToString() {
        return  "MotorizedLandVehicle" + 
                "\n---------------------------------------" +
                "\n" + super.ToString() +
                "\ncarTax= " + carTax + "%" + 
                "\ncarType= " + carType + 
                "\nplate= " + plate + 
                "\ntractionType= " + tractionType;
    }
    
    @Override
    public void requestsInformation(){
        int opcCarT = 0;
        int opcTracT = 0;
        boolean flag = false;
        
        super.requestsInformation();
        
        do{            
            try{
                System.out.println("Ingrese el porcentaje del Impuesto Vehicular: ");
                this.carTax = sc.nextFloat();

                do{
                    System.out.println("Seleccione el tipo de vehiculo: ");
                    System.out.println("1. SUV ");
                    System.out.println("2. Pickup");
                    opcCarT = sc.nextInt();

                    switch(opcCarT){
                        case 1:
                            this.carType = "SUV";
                            break;
                        case 2:
                            this.carType = "Pickup";
                            break;
                        default:
                            System.out.println("----------------------------");
                            System.err.println("Selecciona una opcion valida");
                            System.out.println("----------------------------");
                            sc.nextLine();
                            break;
                    }                                        
                }while(opcCarT < 1 || opcCarT > 2);                       

                System.out.println("Ingrese la matricula del vehiculo: ");
                this.plate = sc.next().toUpperCase();

                do{
                    System.out.println("Seleccione el tipo de traccion del vehiculo: ");
                    System.out.println("1. RWD ");
                    System.out.println("2. FWD");
                    System.out.println("3. 4x4");
                    opcTracT = sc.nextInt();

                    switch(opcTracT){
                        case 1:
                            this.tractionType = "RWD";
                            break;
                        case 2:
                            this.tractionType = "FWD";
                            break;
                        case 3:
                            this.tractionType = "4x4";
                            break;

                        default:
                            System.out.println("----------------------------");
                            System.err.println("Selecciona una opcion valida");
                            System.out.println("----------------------------");
                            break;
                    }

                }while(opcTracT < 1 || opcTracT > 3); 
                
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
    public float getCarTax() {
        return carTax;
    }

    public void setCarTax(float carTax) {
        this.carTax = carTax;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getTractionType() {
        return tractionType;
    }

    public void setTractionType(String tractionType) {
        this.tractionType = tractionType;
    }
    
}
