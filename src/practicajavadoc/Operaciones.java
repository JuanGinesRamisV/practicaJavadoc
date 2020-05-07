/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajavadoc;
import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Operaciones {

    /**
     * Esta función suma dos numeros pasados por parametro
     * @param a El primer número
     * @param b El segundo número
     * @return La suma de los dos numeros
     */
    public static int suma(int a, int b){
        int c= a+b;
        return c;
    }
    
    /**
     * Esta función devuelve el numero máximo de dos numeros pasados por parametro
     * @param a El primer número
     * @param b El segundo número
     * @return El número máximo de los dos numeros pasados por parametro
     */
    public static int findMax(int a, int b){
        int max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        return max;
    }
    
    /**
     * Esta función devuelve la multiplicación de dos numeros
     * @param a El primer número 
     * @param b El segundo número
     * @return La multipliación de ambos numeros
     */
    public static int multiplicar(int a, int b){
        int c =a*b;
        return c;
    }
}

