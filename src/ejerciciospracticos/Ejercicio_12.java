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
 *
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * 
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. 
 * 
 * Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
*
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String fde;
        int contCorrectas=0;
        int contIncorrectas=0;
        
        do {            
            System.out.println("Ingresa una cadena");
            fde=leer.nextLine().toLowerCase();
            
            if(fde.equals("&&&&&")){
                break;
            }
            
            if(fde.length()<=5 && fde.endsWith("o") && fde.startsWith("x")){
                contCorrectas++;
            }else{
                contIncorrectas++;
            }
            
        } while (!(fde=="&&&&&"));//no es necesaria la condicion por el break
        
        System.out.println("Se contaron " + contCorrectas + " correctas \n"
                + "Y " + contIncorrectas + " incorrectas.");
    }
    
    public static String validacionCadena(String cadena){
        Scanner leer = new Scanner(System.in);
        
        while (!(cadena.length()<=5 || cadena.endsWith("o") || cadena.startsWith("x"))) {            
            System.out.println("La cadena debe comenzar con la letra X, terminar con la O, y maximo 5 caracteres \n"
                    + "Por favor intenta de nuevo");
            
            cadena=leer.next();
        }
        
        return cadena;
        
    }

}
