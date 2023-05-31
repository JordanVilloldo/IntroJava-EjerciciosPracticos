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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     *
     *
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
     * después toda en minúsculas. Nota: investigar la función toUpperCase() y
     * toLowerCase() en Java.
*
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println("Tu frase en mayusculas: \n" + frase.toUpperCase());
        System.out.println("");
        System.out.println("Tu frase en minusculas: \n" + frase.toLowerCase());
    }

}
