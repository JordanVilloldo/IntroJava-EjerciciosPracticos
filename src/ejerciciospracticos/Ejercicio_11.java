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
public class Ejercicio_11 {

/**
 * @param args the command line arguments
 *
 * Realizar un programa que pida dos números enteros positivos por teclado y
*  muestre por pantalla el siguiente menú:
 MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
    * El usuario deberá elegir
     * una opción y el programa deberá mostrar el resultado por pantalla y luego
     * volver al menú. El programa deberá ejecutarse hasta que se elija la
     * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
     * vez de salir del programa directamente, se debe mostrar el siguiente
     * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
     * contrario se vuelve a mostrar el menú.
* */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa dos numeros enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        
        menuFuncion(num1,num2);
        
        
    }
    
    public static void menuMostrar(){
        System.out.println("MENU \n"
                + "1. Sumar \n"
                + "2. Restar \n"
                + "3. Multiplicar \n"
                + "4. Dividir \n"
                + "5. Salir \n"
                + "Elija opción:");
    }
    
    public static void menuFuncion(int num1, int num2){
        Scanner leer = new Scanner(System.in);
        //inicializo variables
        int suma=num1+num2;
        int resta=num1-num2;
        int multiplicacion=num1*num2;
        double division=(double)num1/num2;/// el (double) me convierte los numeros en double para que permita imprimir la cuenta real
        
        int opcion;
        char respuesta=0;
        
        
        do {                  
        
        menuMostrar();
        
        opcion= leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("La suma es " + suma);
                break;
                
            case 2:
                System.out.println("La resta es " + resta);
                
                break;
                
            case 3:
                System.out.println("La multiplicación es " + multiplicacion);
                break;
                
            case 4:
                System.out.println("La división es " + division);
                break;
                
            case 5:
                System.out.println("Esta seguro que desea salir? \n"
                        + "Si desea salir digite la letra S, de lo contrario cualquier otra letra.");
                respuesta=leer.next().charAt(0);
                respuesta=Character.toUpperCase(respuesta);
              
                break;
        }//fin switch
            System.out.println("----------------");
        
       } while (respuesta!='S');
    }
    

}
