/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progratrabajoclase_s7;

/**
 *
 * @author lizet
 */
public class facturacion {
  String factura="", itemsfactura="";
    
  public void itemsfactura(String item,int precio){
        itemsfactura=(itemsfactura+"1"+"_____"+item+"____"+precio+" Lps.\n");
        }
  public void borraritems(){
      itemsfactura="";
  }
  
  public float descuento(int edad,float cuenta){
     float descuento, total;
        if(edad>=60)  // mayor de tercera edad tiene 25%
            descuento=(float)0.75 ;
        else         
            descuento=1 ;
        total=(float)(cuenta*descuento) ;
        return total ;
     }
  public String mostrarfactura(int edad,float cuenta){
      factura=("\n**********FACTURA***********\n"+itemsfactura
                 +"\nEl total de su factura es "+cuenta
                 +"\n Total a pagar menos descuentos: "+descuento(edad, cuenta));
         
         return factura;
    }
  
  public String cierrecaja(float totaldia,int clientes){
     String cierre=("\n********CIERRE DE CAJA********\nTotal de ventas del dia: "
             +totaldia+"\nTotal de clientes atendidos: "+clientes);
     return cierre;
              
  }
}
