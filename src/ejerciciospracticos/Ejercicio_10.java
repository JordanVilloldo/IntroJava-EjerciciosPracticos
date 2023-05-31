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
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     *
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a
     * continuación solicite números al usuario hasta que la suma de los números
     * introducidos supere el límite inicial.
*
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un limite positivo"));
        
        alcanzarLimite(limite);
    }
    
    public static void alcanzarLimite(int limite){
        
        int suma=0;
        int num;
        
        do {    
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero a sumar"));
            
            suma+=num;
            System.out.println("Limite: " + limite
            + "\n Suma: " + suma);
            
            
        } while (suma<limite);
    }

}
