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
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     *
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa).
*
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix = new int[4][4];
        
        fillMatrix(matrix);
        showMatrix(matrix);
        System.out.println("---------");
        System.out.println("Matriz transpuesta:");
        transposedMatrix(matrix);
        
    }//fin main
    
    public static int[][] fillMatrix(int[][] matriz){
       // Scanner leer = new Scanner(System.in);
        //System.out.println("Ingresa valores de la matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
              matriz[i][j]=(int) (Math.random()*10)+1;
            //  matriz[i][j]=leer.nextInt();
            }
        }
        
        return matriz;
    }
    
    public static void showMatrix(int[][] matriz){
        
        System.out.println(Arrays.deepToString(matriz).replace("], ", "]\n").replace("[","").replace("]",""));//buscar funcionamiento
        
    }
    
    public static void transposedMatrix(int[][] matriz){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
    }
    
}
