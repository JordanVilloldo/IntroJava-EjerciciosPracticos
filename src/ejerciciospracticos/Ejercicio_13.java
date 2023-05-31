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
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     *
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
     * lo siguiente: * * * *
     *               *     *
     *               *     *
     *               * * * *
     * 
     * 
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de elementos por lado que deseas");
        int n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
            
                if(i==0 || i==(n-1) || j==0 || j==(n-1)){
                    System.out.print("*");                    
                }else{
                  System.out.print(" ");  
                }
                
            }
                
            System.out.println("");
        }
    }

}
