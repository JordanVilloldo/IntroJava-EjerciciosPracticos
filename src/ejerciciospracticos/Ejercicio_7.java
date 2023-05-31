/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     *
     * Crear un programa que pida una frase y si esa frase es igual a “eureka”
     * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
     * Incorrecto. Nota: investigar la función equals() en Java.
*
     */
    public static void main(String[] args) {
        int respuesta;
      
        // TODO code application logic here
        
        do {            
            
        String frase=JOptionPane.showInputDialog("Ingresa una frase");
        
        if (frase.equals("eureka")) {
            JOptionPane.showMessageDialog(null, "Correcto");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrecto");
        }
        
           respuesta = JOptionPane.showConfirmDialog(null, "Desea intentar de nuevo?"); //si=0;no=1;cancelar=2
           
        } while (respuesta==0);
        
    }

}
