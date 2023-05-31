/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     *
     * Escriba un programa que pida una frase o palabra y valide si la primera
     * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
     * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
     * Substring y equals() de Java.
*
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int respuesta;
      
        // TODO code application logic here
        
        do {            
            
        String frase=JOptionPane.showInputDialog("Ingresa una frase");
          
        if (frase.substring(0,1).equals("A")) {
            JOptionPane.showMessageDialog(null, "Correcto");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrecto");
        }
        
           respuesta = JOptionPane.showConfirmDialog(null, "Desea intentar de nuevo?"); //si=0;no=1;cancelar=2
           
        } while (respuesta==0);
        
    
    }

}
