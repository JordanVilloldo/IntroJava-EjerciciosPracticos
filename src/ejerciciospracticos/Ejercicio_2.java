/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author Jordan
 *
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
* */

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
    }
    
    
    
}
