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
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     *
     * Escribir un programa que lea un número entero por teclado y muestre por
     * pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
     * investigar la función Math.sqrt().
*
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa un numero");
        int num = leer.nextInt();
        
        System.out.println("El doble de tu numero es: " + num*2);
        System.out.println("El triple de tu numero es: " + num*3);
        System.out.println("La raiz cuadrada de tu numero es: " + Math.sqrt(num));
    }

}
