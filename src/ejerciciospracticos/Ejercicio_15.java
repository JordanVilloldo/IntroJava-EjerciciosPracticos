/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Arrays;

/**
 *
 * @author Jordan
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     *
     * Realizar un algoritmo que rellene un vector con los 100 primeros números
     * enteros y los muestre por pantalla en orden descendente.
*
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] vector=new int[100];
        
        for (int i = 99; i >-1; i--) {
            vector[i] = i+1;
        }
       
        for (int i = 99; i > -1 ; i--) {
            System.out.print(vector[i] + " ");
        }
    }

}
