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
public class Ejercicio_20 {

    /**
     * @param args the command line arguments
     *
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al
     * 9 donde la suma de sus filas, sus columnas y sus diagonales son
     * idénticas. Crear un programa que permita introducir un cuadrado por
     * teclado y determine si este cuadrado es mágico o no. El programa deberá
     * comprobar que los números introducidos son correctos, es decir, están
     * entre el 1 y el 9.
*
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix = new int[3][3];
        
        fillMatrix(matrix);
        showMatrix(matrix);
        
        System.out.print("La matriz es magica? ");
        System.out.println(magicMatrix(matrix));
        
    }//fin main
    
    public static boolean magicMatrix(int[][] matriz){
        int sumDiagonal1=0;
        int sumDiagonal2=0;
        int sumRow=0;
        int sumColumn=0;
        boolean magic=false;
        
        for (int i = 0; i < 3; i++) {
            
            sumDiagonal1 += matriz[i][i];
            sumDiagonal2 += matriz[i][3-i-1];
            
            for (int j = 0; j < 3; j++) {
                sumRow += matriz[i][j];
                sumColumn += matriz[j][i];
            }//fin for j
            
        }//fin for i
        
        //multiplicamos para igualar la cantidad de filas que sumamos
        sumDiagonal1 *= 3;
        sumDiagonal2 *= 3;
        
        if (sumRow==sumColumn && sumRow==sumDiagonal1 && sumRow==sumDiagonal2) {
            magic=true;
        }//fin if
        
        return magic;
    }//fin magicMatrix
    
    public static int validationNum(int num){
        Scanner leer = new Scanner(System.in);
        while (num<1 || num>9) {            
            System.out.println("Lo siento, el numero debe estar entre 1 y 9. \n"
                    + "Intenta de nuevo!");
            num=leer.nextInt();
        }
        
        return num;
    }
    
    public static int[][] fillMatrix(int[][] matriz){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa valores de la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              //  matriz[i][j]=(int) (Math.random()*10)+1;
              matriz[i][j]=leer.nextInt();
              matriz[i][j]=validationNum(matriz[i][j]);
            }
        }
        
        return matriz;
    }
        
    public static void showMatrix(int[][] matriz){
        
        System.out.println("Matriz:");
        
        System.out.println(Arrays.deepToString(matriz).replace("], ", "]\n").replace("[","").replace("]",""));//buscar funcionamiento
        
    }

}
