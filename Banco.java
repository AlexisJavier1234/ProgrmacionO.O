/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Banco {
   
    
public static void main(String[]args){    
 Scanner sc= new Scanner (System.in);   
 Cuenta cliente1= new Cuenta();
         
 int op=0;
 while (op!=5){
 System.out.println("SISTEMA BANCARIO");
 System.out.println("1.Actualizar saldo");
 System.out.println("2.Ingresar Saldo");
 System.out.println("3.Retirar");
 System.out.println("4.Mostrar Datos");
 System.out.println("5.Salir");
 op=sc.nextInt();
 
 switch (op){
 case 1:
 cliente1.ActualizarSaldo();
 System.out.println("Su nuevo saldo es:"+cliente1.getSaldoActual());
  break;
 case 2:
 System.out.println("¿Cuanto desea ingresar a la cuenta?");
 double saldo=sc.nextDouble();
 cliente1.IngresarSaldo(saldo);
 System.out.println("Su nuevo saldo es: "+cliente1.getSaldoActual());
 break;
 case 3:
 System.out.println("Cuanto desea retirar");
 double retiro=sc.nextDouble();
 cliente1.Retirar(retiro);
 System.out.println(" Su nuevo saldo es:"+ cliente1.getSaldoActual());
 break;
 case 4:
 String Datos=cliente1.MostrarDatos(cliente1);
 System.out.println(Datos);
 break;
 case 5:
 System.out.println("Salir");
 break;
}
}
}
}
