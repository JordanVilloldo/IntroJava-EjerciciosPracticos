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
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     *
     *
     * Realizar un programa que solo permita introducir solo frases o palabras
     * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
     * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
     * Lenght() en Java.
*
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int respuesta;
      
        // TODO code application logic here
        
        do {            
            
        String frase=JOptionPane.showInputDialog("Ingresa una frase");
        
        if (frase.length()==8) {
            JOptionPane.showMessageDialog(null, "Correcto");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrecto");
        }
        
           respuesta = JOptionPane.showConfirmDialog(null, "Desea intentar de nuevo?"); //si=0;no=1;cancelar=2
           
        } while (respuesta==0);
        
    }  

}
