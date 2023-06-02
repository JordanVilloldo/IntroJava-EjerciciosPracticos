/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author Jordan
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     *
     * Crea una aplicación que a través de una función nos convierta una
     * cantidad de euros introducida por teclado a otra moneda, estas pueden ser
     * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad
     * de euros y la moneda a converir que será una cadena, este no devolverá
     * ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
* */
    public static void main(String[] args) {
        // TODO code application logic here
      int respuesta;
      
      //do while para preguntar la continuidad del programa
        do {            
            
            menu();
            
          respuesta =  JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
        } while (respuesta==0);
        
    }//fin main
    
    
    public static void menu(){
             
        //menu de diferentes monedas
        int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona a que moneda deseas convertir:\n"
                + "1.Libras\n "
                + "2.Dolar\n "
                + "3.Yen\n "
                + "4.Salir"));

        switch (opcion){
            
            case 1:
                //JOptionPane.showInputDialog(null, "Libras");
                conversion(0);
                break;
            case 2:
                //JOptionPane.showInputDialog(null, "Dólar");
                conversion(1);
                break;
            case 3:
               // JOptionPane.showInputDialog(null, "Yen");
                conversion(2);
                break;
            case 4:
               // JOptionPane.showInputDialog(null, "Salir");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                break;
    }//fin switch
   
    }//fin metodo menu
    
    public static void conversion(int monedaElegida){
        //Creo vector con el costo de cada moneda
        double[] monedas = new double[3];
        monedas[0]=0.86;
        monedas[1]=1.28611;
        monedas[2]=129.852;
        
        //Creo vector con cada moneda String
        String[] nombreMoneda = new String[3];
        nombreMoneda[0]="Libras";
        nombreMoneda[1]="Dolares";
        nombreMoneda[2]="Yenes";
        
         //Vamos a pedirle al usuario que ingrese la cantidad de dolares
        int euro = Integer.parseInt(JOptionPane.showInputDialog("Ingresala cantidad de euros que deseas convertir"));
        
        //Realizo la conversion
        double resultado=monedas[monedaElegida]*euro;
        
        //imprimo en pantalla
        JOptionPane.showMessageDialog(null, "La conversion da como resultado:\n" 
                + resultado + " " + nombreMoneda[monedaElegida]);
        
        
    }// fin metodo conversion
    
    
}
