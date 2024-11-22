/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progratrabajoclase_s7;

import java.util.Scanner;

public class PrograTrabajoClase_S7 {

    public static void main(String[] args) {
      
      Scanner entrada=new Scanner(System.in);
      int indice, mascafe, nuevafactura,edad,clientes=0 ;
      float  cuenta=0,totaldia=0 ;
      String menu="""
                ****MENU****
                1.Grande.....65 lps.
                2.Mediano....56 lps.
                3.Pequenio...45 lps.
                """, 
            menu2="""
                  Desea agregar:
                  4. Leche.....+5 lps.
                  5. Cremora...+8 lps.
                  6. Ninguno...+0 lps.
                  """;
      
      cafe [] items=new cafe [6];
      int [] contadores=new int[items.length]; //arreglo de contadores de cuanto se vende de cada item
        //arreglo de objetos
        items[0]=new cafe("cafe grande",65);
        items[1]=new cafe("cafe mediano",56);
        items[2]=new cafe("cafe pequenio",45);
        items[3]=new cafe("agregado leche",5);
        items[4]=new cafe("agregado cremora",8);
        items[5]=new cafe("agregado sencillo",0);

        
      facturacion m=new facturacion();
    do{
      System.out.println("Ingrese la edad del cliente:"); 
      edad=entrada.nextInt();
      cuenta=0;
       do{
        System.out.println(menu);
         indice=(entrada.nextInt()-1);
         cuenta=(cuenta+items[indice].getPrecio());
         contadores[indice]++;
         m.itemsfactura(items[indice].getTamanio(),items[indice].getPrecio());
         
        System.out.println(menu2); 
          indice=(entrada.nextInt()-1); 
          cuenta=(cuenta+items[indice].getPrecio());
          contadores[indice]++;
         m.itemsfactura(items[indice].getTamanio(),items[indice].getPrecio());
         
        System.out.println("Desea agregar otro cafe a su cuenta?\n1.Si\n2.No"); 
         mascafe=entrada.nextInt();
       }
       while(mascafe==1);
       
        System.out.println(m.mostrarfactura(edad, cuenta));
        cuenta= m.descuento(edad, cuenta);
        totaldia=(totaldia+cuenta);
        clientes++;
        m.borraritems();
        System.out.println("\nSeleccione:\n1.Nueva Factura\n2.Cierre del dia");    
        nuevafactura=entrada.nextInt();
        
    }
    while(nuevafactura==1);
        System.out.println(m.cierrecaja(totaldia, clientes));
       for (int i = 0; i < items.length; i++) {
            System.out.println("Se vendio "+contadores[i]+" de "+items[i].getTamanio());
        }
    }
    
}
