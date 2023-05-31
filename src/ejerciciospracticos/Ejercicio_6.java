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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     *
     * Crear un programa que dado un numero determine si es par o impar.
     * */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = leer.nextInt();
        
        parOImpar(num);
    }
    public static void parOImpar(int num){
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
    
}
