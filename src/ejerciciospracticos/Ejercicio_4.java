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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     *
     *
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
     * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados centigrados");
        int gradosC = leer.nextInt();
        
        int gradosF = (32 + (9 * gradosC / 5));
        
        System.out.println(gradosC + "ºC equivalen a " + gradosF + "ºF.");
    }

}
