/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     *
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
     * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
     * equivalente: 1 día, 2 horas.
*
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int min;
        
        System.out.println("Ingresa cantidad de minutos");
        min=leer.nextInt();
        
        equivalente(min);
        
    }
    
    public static void equivalente(int min){
        int dia;
        int hora;
        
        dia=(min/60)/24;
        hora=(min/60)-(dia*24);
        
        System.out.println(min + " minutos equivalen a: \n"
                + dia + " día/s \n"
                + hora + " hora/s.");
    }

}
