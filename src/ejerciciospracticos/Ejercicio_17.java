/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import static java.lang.Math.floor;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     *
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        //inicializo variables
        int cifras;
        int unaCif=0;
        int dosCif=0;
        int tresCif=0;
        int cuatroCif=0;
        int cincoCif=0;

        System.out.println("Ingrese la cantidad de numeros aleatorios a generar");

        int n = leer.nextInt();
        int[] vector = new int[n];

        //lleno el vector aleatorio
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99999) + 1;
        }
        //lo imprimo para testearlo
        System.out.println(Arrays.toString(vector));

        for (int i = 0; i < n; i++) {
            cifras = cantidadCifras(vector[i]);
            
            switch (cifras) {
            case 1:
                unaCif++;
                break;
            case 2:
                dosCif++;
                break;
            case 3:
                tresCif++;
                break;
            case 4:
                cuatroCif++;
                break;
            case 5:
                cincoCif++;
                break;
            default:
                throw new AssertionError();
        }//fin switch

        }//fin for
        
        System.out.println("Contamos la cantidad de numeros con cierta cantidad de cifra. \n"
                + "Cifras | Cantidad \n"
                + "_________________ \n"
                + "1. | " + unaCif + "\n"
                + "2. | " + dosCif + "\n"
                + "3. | " + tresCif + "\n"
                + "4. | " + cuatroCif + "\n"
                + "5. | " + cincoCif + "\n");

    }//fin main

    public static void contabilizadorCifras(int cifra) {
        
        int unaCif=0;
        int dosCif=0;
        int tresCif=0;
        int cuatroCif=0;
        int cincoCif=0;
        
        
        switch (cifra) {
            case 1:
                unaCif++;
                break;
            case 2:
                dosCif++;
                break;
            case 3:
                tresCif++;
                break;
            case 4:
                cuatroCif++;
                break;
            case 5:
                cincoCif++;
                break;
            default:
                throw new AssertionError();
        }//fin switch
        
        System.out.println("");

    }

    public static int cantidadCifras(int num) {

        int cont = 0;
        
        if (num==0) {
            cont++;
        }

        while (num != 0) {
            num /= 10;

            // floor(num); // creo que en este caso no hace falta
            // System.out.println(num);
            cont++;
        }

        return cont;

    }

}
