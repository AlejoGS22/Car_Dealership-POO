package Car_Dealership;

import java.util.Scanner;

/**
 *
 * @author Alejandro GS
 */
public class Main {
    public static void main(String[] Args){
        IInvoice objInvoice = null;
        Scanner sc = new Scanner(System.in);                
        boolean flag = false;
        int opc = 0;
        
        do{          
            try{                                
                System.out.println("-------------------------------------------");
                System.out.println("Seleccione una opcion: ");
                System.out.println("-------------------------------------------");
                System.out.println("1. Agregar una venta");
                System.out.println("2. Impirmir factura");
                System.out.println("3. Finalizar Ventas");                
                opc = sc.nextInt();

                switch(opc){
                    case 1 -> {objInvoice = new Invoice();
                        objInvoice.GetTotalAmount();
                    }
                    case 2 -> objInvoice.GetValueToPay();
                    case 3 -> flag = true;
                    default -> {
                        System.out.println("----------------------------");
                        System.err.println("Seleccione una opcion valida");
                        System.out.println("----------------------------");                        
                    }
                }                           
            }catch(Exception e){
                System.out.println("-----------------------");
                System.err.println("Tipo de dato no valido" );
                System.out.println("-----------------------"); 
                sc.nextLine();
            }            
        }while(flag != true);
    }
}
