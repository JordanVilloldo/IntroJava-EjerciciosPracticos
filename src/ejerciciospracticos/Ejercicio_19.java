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
public class Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matrix = new int[3][3];
        
        fillMatrix(matrix);
        showMatrix(matrix);
        System.out.println("---------");
        System.out.println("Matriz transpuesta:");
        transposedMatrix(matrix);
        
        System.out.println("Es anti simétrica?");
        System.out.println(antiSimetrica(matrix));
        
    }//fin main
    
    public static int[][] fillMatrix(int[][] matriz){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa valores de la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              //  matriz[i][j]=(int) (Math.random()*10)+1;
              matriz[i][j]=leer.nextInt();
            }
        }
        
        return matriz;
    }
    
     public static void showMatrix(int[][] matriz){
        
        System.out.println(Arrays.deepToString(matriz).replace("], ", "]\n").replace("[","").replace("]",""));//buscar funcionamiento
        
    }
     
     public static void transposedMatrix(int[][] matriz){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
    }
     
     public static boolean antiSimetrica(int[][] matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j]!=(-(matriz[j][i]))) {
                    return false;
                }//fin if
            }//fin for j
        }//fin for i
        return true;
    }//fin antiSimetrica
}
