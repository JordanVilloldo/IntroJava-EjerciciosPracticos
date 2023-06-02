/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     *
     * Realizar un algoritmo que rellene un vector de tamaño N con valores
     * aleatorios y le pida al usuario un numero a buscar en el vector. El
     * programa mostrará donde se encuentra el numero y si se encuentra repetido
*
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
       
        
        System.out.println("Ingrese la cantidad de numeros aleatorios a generar");

        int n = leer.nextInt();
        int[] vector = new int[n];
        
        //lleno el vector aleatorio
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 10) + 1;
        }
        //lo imprimo para testearlo
        System.out.println(Arrays.toString(vector));
        
        System.out.println("Ingrese un numero para buscarlo en el vector");
        int numElegido = leer.nextInt();
        
        
         //inicializo variable contador
        int cont=0;
    
        
        
        for (int i = 0; i < vector.length; i++) {
            
            if(vector[i]==numElegido && cont==0) {
                System.out.println("Se encontro tu numero! :D \n"
                        + "En la posicion: [" + i + "]");
                cont++;
            }else if (vector[i]==numElegido && cont>0) {
                if (cont==1) {
                    System.out.print("Notamos que tu numero se encuentra repetido!!:O \n"
                        + "Tambien en la posicion/es: [" + i + "]");
                    cont++;
                }else{
                    System.out.print("[" + i + "]");
                }//fin if anidado
                
            }
        }//fin for
        
        if (cont==0) {
            System.out.println("No se encontro ninguna vez tu numero :(");
        }
        
    }//fin main
    

}
