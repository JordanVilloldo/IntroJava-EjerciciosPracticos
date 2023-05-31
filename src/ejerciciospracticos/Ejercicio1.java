/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 *
 *
 * Escribir un programa que pida dos números enteros por teclado y calcule la
 * suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));

        int suma = num1 + num2;
        
        JOptionPane.showMessageDialog(null,"la suma es: " + suma );
        
        System.out.println("La suma es: \n" + suma); //  \n es para un salto de linea

    }
}
