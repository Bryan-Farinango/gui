/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexepciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ESFOT
 */
public class EjercicioExepciones {

    
    public static void main(String[] args) {
        // TODO code application logic h
        
       try{
    
             Scanner scan = new Scanner(System.in);
        String numeroJOption = JOptionPane.showInputDialog("Ingrese la cantidad a ingresar");
        int n = Integer.parseInt(numeroJOption);
       // System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
        int arreglo[] = new int[n];
       // int arregloToInt[] = new int[n];

     
        
        //JOptionPane.showMessageDialog(parentComponent, scan, numeroJOption, n);
       for(int i=0; i<arreglo.length; i++){
            
           
           String resultado = JOptionPane.showInputDialog(null, "Ingrese el numero en la posicion ["+(i+1)+"]: ");
           int resultadoToInt = Integer.parseInt(resultado);
           arreglo[i] = resultadoToInt;
           
           //JOptionPane.showMessageDialog(null, "El numero en la posicion ["+(i)+"], es: ", "RESULTADO", 0);
           
          
           
        }
                
          for(int i=0; i<arreglo.length; i++){
              
           String posicion = JOptionPane.showInputDialog("Ingrese la posicion que desea obtener");
           int posicionToInt = Integer.parseInt(posicion);
           
           String respuesta = String.valueOf(arreglo[posicionToInt]);
           JOptionPane.showMessageDialog(null, "El numero en la posicion ["+(i+1)+"], es: "+respuesta, "RESULTADO", 0);   
           break;
}



        
       
        
        }catch(Exception ex ){
        
            String mensaje = ex.getMessage();
            System.out.println("Error numero largo para lo seleccionado: "+mensaje);
        
        }
        
       
        
       /* for(int i=0; i<arreglo.length; i++){
            
            String posicion = JOptionPane.showInputDialog("Ingrese la posicion del numero que desea obtener: ");
            int pos = Integer.parseInt(posicion);
            
            if( pos == 1){
//                JOptionPane.showOptionDialog(parentComponent, scan, posicion, pos, pos, icon, args, posicion)
            
                System.out.println("Posicion: "+ i);
                items[i] = i;
                String nummeroToString = String.valueOf(i);
                JOptionPane.showMessageDialog(null, "El numero de la posicion es: ["+nummeroToString+"]", "RESPUESTA", 0);
            }
            
        }
        */
  
        
    }
    
}
