/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Random;

/**
 *
 * @author Jordan
 */
public class Ejercicio_21 {

    /**
     * @param args the command line arguments
     *
     * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y
     * la matriz P de 3x3, se solicita escribir un programa en el cual se
     * compruebe si la matriz P está contenida dentro de la matriz M. Para ello
     * se debe verificar si entre todas las submatrices de 3x3 que se pueden
     * formar en la matriz M, desplazándose por filas o columnas, existe al
     * menos una que coincida con la matriz P. En ese caso, el programa debe
     * indicar la fila y la columna de la matriz M en la cual empieza el primer
     * elemento de la submatriz P.
*
     */
    static int[][] m = new int[10][10];
    static int[][] p = new int[3][3];
    static Random r = new Random();
    
    
    public static void main(String[] args) {
        FillM();
        FillP();
        ColocarP();

        System.out.println("Matriz P 3x3");
        ShowMatrix(p);
        System.out.println("Matriz M 10x10");
        ShowMatrix(m);
        System.out.println("P se encuentra en M?");
        BuscarP();
    }
    public static void FillM(){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
    }
    
    public static void FillP(){
        p[0][0] = 36;
        p[0][1] = 5;
        p[0][2] = 67;
        p[1][0] = 89;
        p[1][1] = 90;
        p[1][2] = 75;
        p[2][0] = 14;
        p[2][1] = 22;
        p[2][2] = 26;
    }
    
    public static void ColocarP(){
        int row = (int)(Math.random() * 7) + 1;
        int coll = (int)(Math.random() * 7) + 1;
        for (int i = row; i < row+3; i++) {
            for (int j = coll; j < coll+3; j++) {
                m[i][j] = p[i-row][j-coll];
            }
        }
    }
    
    public static void ShowMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println();
        }
        SaltoLinea();
    }
    
    public static void BuscarP(){
        boolean content;
        int count=0;
        
        for (int i = 0; i < m.length-2; i++) {
            for (int j = 0; j < m.length-2; j++) {
                
                content = BuscarPEn(i, j);
                if(content){
                    System.out.println("[" + i + "] [" + j + "]");
                    System.out.println(":-)");
                    count++;
                    break;
                }//fin if
            }//fin for j
        }//fin for i
        if(count==0){
            System.out.println("404 :(");
        }
    }

    public static boolean BuscarPEn(int row, int coll){
        for (int i = row; i < row+3; i++) {
            for (int j = coll; j < coll+3; j++) {
                if(m[i][j] != p[i-row][j-coll]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void SaltoLinea(){
        System.out.println();
    }
    
    /*public static void Enrique(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matriz1[i][j]==matriz2[0][0]) first=true;
                if (first){
                    for (int k = i; k < i+3; k++) {
                        for (int l = j; l < j+3; l++) {
                            if (matriz1[k][l]==matriz2[k-i][l-j]) count++;
                        }
                    }
                    if (count==9) {
                        content=true;
                        return;
                    }
                    else count=0;
                }
                first=false;
            }
        }
    }*/
}
