
package productos;

import javax.swing.JOptionPane;
 /*Indicar cuantos productos cuestan más de 10.000 y cuantos productos cuentan con una cantidad inferior o igual a 4 unidades*/

public class Productos {

    public static void main(String[] args) {
        
        producto VP[] = new producto [5];
        producto P; 
        int sumaProductos=0;
        int contadorUidadesMenor=0;
        int contadorUidadesMayor=0;
        
        for (int i = 0; i < VP.length; i++) {
            
            String Cod= JOptionPane.showInputDialog("Ingrese el codigo del producto " + (i +1)+ " : ");
            String Nom= JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i +1)+ " : ");
            double Valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del producto: "));
            int Cant= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
            
            P= new producto ();
            
            P.setCodigo(Cod);
            P.setNombre(Nom);
            P.setValorUnitario(Valor);
            P.setCantidad(Cant);
            
            VP[i]=P;
            
            if (VP[i].getValorUnitario()> 10000)  {
             sumaProductos++;}
         
            if (VP[i].getCantidad()<5)  {
             contadorUidadesMenor++;}
            
            else{ 
               contadorUidadesMayor++;     
                    }
        }
        
        for (int i = 0; i < VP.length; i++) {
                System.out.println (VP[i].toString());
            
            }
            System.out.println("La cantidad de productos que cuestan mas de 10.000 es: "+sumaProductos );
            System.out.println("Los productos que cuentan con una cantidad inferior  a 5 unidades es: "+ contadorUidadesMenor );
            System.out.println("Los productos que cuentan con una cantidad mayor o igual a 5 unidades es: "+ contadorUidadesMayor );
        
        
        
    }
    
}
